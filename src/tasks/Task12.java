package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
	// write a function that finds the maximum product that can be formed by
	// multiplying any four integers.
	public static void maximumProduct(int[] inputX) {

		int count = inputX.length;
		Arrays.sort(inputX);
		int product = inputX[count - 1] * inputX[count - 2] * inputX[count - 3] * inputX[count - 4];
		System.out.println(product + "(" + inputX[count - 1] + " * " + inputX[count - 2] + " * " + inputX[count - 3]+ " * " + inputX[count - 4] + " ) ");
	}

	public static void main(String[] args) {
		int[] input = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 6 numbers");
		input[0] = sc.nextInt();
		input[1] = sc.nextInt();
		input[2] = sc.nextInt();
		input[3] = sc.nextInt();
		input[4] = sc.nextInt();
		input[5] = sc.nextInt();
		
		maximumProduct(input);
		sc.close();
	}

}
