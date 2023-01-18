package tasksTuesday;

import java.util.Scanner;
import java.util.Stack;

public class Task2 {
	public static void check(String word) {
		Stack<Character> stackWord = new Stack<Character>();
		String reverseWord = "";
		for (int i = 0; i < word.length(); i++) {
			stackWord.add(word.charAt(i));
		}
		while(!stackWord.isEmpty()) {
			reverseWord = reverseWord + stackWord.pop();
		}
		if(word.equalsIgnoreCase(reverseWord)) {
			System.out.println("is a palindrome ");
		}
		else {
			System.out.println("is not a palindrome ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word to check if it is palindrome or not : ");
		check(sc.next());
		sc.close();
	}
}
