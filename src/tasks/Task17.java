package tasks;

public class Task17 {
	public static void findMissing(int[] element) {
		
		for(int i = 0; i <element.length; i++ ) {
			if(element[i] != (i+1 * 5) ) {
				//Still in prograss
			}
		}
		
	}
	// Given an array of integers, write a function to find the missing number in
	// the array where the missing number should be a multiple of 5.

	public static void main(String[] args) {
		int[] numbers = { 5, 10, 20, 25, 30 };
		findMissing(numbers);
	}

}
