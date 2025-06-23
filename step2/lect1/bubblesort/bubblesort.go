package main

import "fmt"

func main() {
	var arr [9]int = [9]int{9, 8, 7, 6, 2, 3, 4, 1, 5}

	for true {
		swapped := false

		for i := 0; i < len(arr)-1; i++ {
			if arr[i] > arr[i+1] {
				temp := arr[i]

				arr[i] = arr[i+1]
				arr[i+1] = temp

				swapped = true
			}
		}

		if !swapped {
			break
		}

		fmt.Println(arr)
	}
}
