package tasks;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		boolean option1 = true ;
		boolean option2 = true ;
		Scanner sc = new Scanner(System.in);
		
		while(option1) {
			System.out.println("Please enter first number :");
			int firstNumber = sc.nextInt();
			if(firstNumber > 100 || firstNumber < 0 ) {
				System.out.println(">>Erorr!! please enter number within 0 - 100");
				
			}
			else {
				option1 = false;
				while(option2) {
					System.out.println("Please enter Second number :");
					int secondNumber = sc.nextInt();
					if(secondNumber > 100 || secondNumber < 0 ) {
						System.out.println(">>Erorr!! please enter number within 0 - 100");
						
					}else {
						option2 = false;
						System.out.println("Great Work");
						System.out.println("You enterd first number " + firstNumber);
						System.out.println("You enterd  Second number " +  secondNumber);
					}
				
				}
			}
		}
		

	}

}
