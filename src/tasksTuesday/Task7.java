package tasksTuesday;

import java.util.Scanner;
import java.util.Stack;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		System.out.print("Enter first number : ");
		stack.push(sc.nextInt());
		System.out.print("Enter Second number : ");
		stack.push(sc.nextInt());
		System.out.print("You entered : ");
		for(Integer a : stack) {
			System.out.print(a + " ");
		}
		sc.close();
	}

}
