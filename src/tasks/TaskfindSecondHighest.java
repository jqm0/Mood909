package tasks;

import java.util.Arrays;

public class TaskfindSecondHighest {

	// Task1: given an array of integers, find the second highest number in the
	// array.
	public static int findSecondHighest(int[] numbers) {
		int numberOfElments = numbers.length;
		Arrays.sort(numbers);
		return numbers[numberOfElments - 2];

	}

	public static void main(String[] args) {
		int[] numbers = { 50, 20, 12, 2, 3, 5, 10, 2 };
		System.out.println("Second Highest number is " + findSecondHighest(numbers));
	}
}
