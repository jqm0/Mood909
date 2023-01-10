package tasks;

import java.util.Scanner;

public class ex2 {
	public static void findPairs(int[] numbers, int sum) {

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == sum) {
					System.out.println(sum + " It is pair are : " + numbers[i] + " and " + numbers[j]);
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = { 2, 3, 4, 5, 1, 7, 10 };
		System.out.println("Please select a number to find it is sum pair :");
		int sum = sc.nextInt();
		findPairs(numbers, sum);
		sc.close();
	}

}
