package main

import "fmt"

func main() {
	arr := []int{3, 2, 4, 0, -1, -5, 3}

	ms := &mergeSort{}

	arr = ms.Sort(arr, 0, len(arr)-1)

	fmt.Println(arr)

}

type mergeSort struct{}

func (m *mergeSort) Sort(arr []int, start int, end int) []int {
	if start == end {
		return arr
	}

	middle := start + (end-start)/2

	m.Sort(arr, start, middle)

	m.Sort(arr, middle+1, end)

	temp := make([]int, 0, end-start+1)

	i, j := start, middle+1

	for i <= middle && j <= end {
		if arr[i] <= arr[j] {
			temp = append(temp, arr[i])
			i++
		} else {
			temp = append(temp, arr[j])
			j++
		}
	}

	for i <= middle {
		temp = append(temp, arr[i])
		i++
	}

	for j <= end {
		temp = append(temp, arr[j])
		j++
	}

	for i = 0; i < len(temp); i++ {
		arr[start+i] = temp[i]
	}

	return arr
}
