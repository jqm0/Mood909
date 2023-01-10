package tasks;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] numbers = {1,2,3,4,3,2,1,22};
		System.out.println("Please enter any number to find how many times it appear : ");
		int number = sc.nextInt();
		int count = 0 ; 
		for(int i = 0 ; i < numbers.length; i++) {
				if(numbers[i] == number ) {
					count ++;
			}
		}
		System.out.println("The number "+number + " is appear "+ count + " times");
		sc.close();
	}

}
