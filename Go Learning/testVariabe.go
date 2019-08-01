package main

import "fmt"

func main() {
	var b int = 15
	var a int
	numbers := [6]int{1, 2, 3, 5}

	/* for loop execution */
	for a := 1; a < 18; a++ {
		for b := 1; b < 18; b++ {
			fmt.Printf("%4d", a*b)
		}
		fmt.Println("")
	}
	for a < b {
		a++
		fmt.Printf("value of a: %d\n", a)
	}
	for i, x := range numbers {
		fmt.Printf("value of x = %d at %d\n", x, i)
	}
}
