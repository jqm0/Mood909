package tasks;

import java.util.Arrays;

public class Task17 {
	public static int[] findLongestSub(int[] element) {
		int maxLongest = 0;
		int startSub = 0;
		int endSub = 0;
		for (int i = 0; i < element.length; i++) {
			int currentSubArray = 1;
			while (i < element.length - 1 && element[i] > element[i + 1]) {
				currentSubArray++;
				i++;
			}
			if (currentSubArray > maxLongest) {
				maxLongest = currentSubArray;
				endSub = i + 1;
				startSub = endSub - maxLongest;
			}
		}

		return Arrays.copyOfRange(element, startSub, endSub);

	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
		int[] output = findLongestSub(numbers);
		for (int number : output) {
			System.out.print(number + " ");
		}
	}

}
