package tasks;

public class Task18 {
	public static void findMissing(int[] numbers) {
		int missingNumber = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] + 5 != numbers[i + 1]) {
				missingNumber = numbers[i] + 5;
			}
		}
		System.out.println("The missing number is : " + missingNumber);
	}

	public static void main(String[] args) {
		int[] numbers = { 5, 10, 20, 25, 30 };
		findMissing(numbers);
	}

}
