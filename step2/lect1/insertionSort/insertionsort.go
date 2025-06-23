package main

import "fmt"

func main() {
	var arr [9]int = [9]int{9, 8, 7, 6, 2, 3, 4, 1, 5}

	for i := 0; i < len(arr); i++ {
		j := i

		for j > 0 && arr[j] < arr[j-1] {
			temp := arr[j]
			arr[j] = arr[j-1]
			arr[j-1] = temp

			j--
		}

		fmt.Println(arr)
	}
}
