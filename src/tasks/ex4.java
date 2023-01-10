package tasks;

public class ex4 {

	public static void main(String[] args) {
		int[] numbers = { 25, 2, 3, 55, 67, 7, 8, 9, 0 };
		int largest = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= largest) {
				largest = numbers[i];
			}

		}
		System.out.println("The Largest number in this list is : " +largest );

	}

}
