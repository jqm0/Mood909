package tasksTuesday;

import java.util.Scanner;
import java.util.Stack;

public class Task8 {
	public static boolean isOerator(char c) {
		if (c == '*' || c == '/' || c == '+' || c == '-' ) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		Stack<Character> operators = new Stack<Character>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the epression :");
		String expr = sc.next();
		System.out.println("The infix experssion is : " + expr);
		for (int i = 0; i < expr.length(); i++) {
			// System.out.println(isOerator(expr.charAt(i)));
			if (isOerator(expr.charAt(i))) {
				if (expr.charAt(i) != '(' || expr.charAt(i) != ')') {
					operators.push(expr.charAt(i));
				}

			} else {
				System.out.print(expr.charAt(i));
				while (!operators.isEmpty()) {
					System.out.print(operators.pop());

				}
			}
		}
		sc.close();
	}
}
