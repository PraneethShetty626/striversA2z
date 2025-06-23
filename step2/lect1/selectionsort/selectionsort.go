package main

import "fmt"

func main() {
	arr := [7]int{3, 4, 2, 7, 1, 9, 6}

	for i := range arr {
		min := arr[i]

		k := i

		for j := i + 1; j < len(arr); j++ {
			if arr[j] <= min {
				min = arr[j]
				k = j
			}
		}

		arr[k] = arr[i]
		arr[i] = min

		fmt.Println(arr)

	}
}
