package tasks;

public class Task14 {
	// Problem: Given an array of integers and a number k, write a function to
	// determine if there are two distinct elements in the array that add up to k
	// and both elements should be even number.
	public static void getPair(int[] array, int k) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] % 2 == 0 && array[j] % 2 == 0) {
					if (array[i] + array[j] == k) {
						System.out.println("( " + array[i] + " + " + array[j] + " = " + k + " )");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 4, 5, 7, 6, 8, 10 };
		int k = 10;
		getPair(numbers, k);
	}

}
