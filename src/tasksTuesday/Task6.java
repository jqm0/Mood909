package tasksTuesday;

import java.util.Arrays;

public class Task6 {

	public static void findSecondMaxNumber(int [] numbers) {
		Arrays.sort(numbers);
		int count = numbers.length;
		System.out.println("The next greater element : " + numbers[count-2]);
	}
	public static void main(String[] args) {
			int[] array = {1, 5, 9, 3, 7, 8, 2, 4, 6};
			findSecondMaxNumber(array);
	}
}
