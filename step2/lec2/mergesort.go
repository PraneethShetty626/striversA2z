package main

import "fmt"

func main() {
	arr := []int{3, 2, 4, 0, -1, -5, 3}

	ms := &mergeSort{arr: arr}

	ms.Sort(0, len(arr)-1)

	fmt.Println(arr)

	fmt.Println(ms.arr)
}

type mergeSort struct {
	arr []int
}

func (m *mergeSort) Sort(start int, end int) {
	arr := m.arr

	if start == end {
		return
	}

	middle := start + (end-start)/2

	m.Sort(start, middle)

	m.Sort(middle+1, end)

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

}
