package tasks;

import java.util.Arrays;

public class Task13 {
 //Problem: Given an array of integers, write a function that finds the third highest number in the array.
	
	public static void findThirdMaxNumber(int [] numbers) {
		Arrays.sort(numbers);
		int count = numbers.length;
		System.out.println("Third Max number is " + numbers[count-3]);
	}
	public static void main(String[] args) {
			int[] array = {1, 5, 9, 3, 7, 8, 2, 4, 6};
			findThirdMaxNumber(array);
	}
}
