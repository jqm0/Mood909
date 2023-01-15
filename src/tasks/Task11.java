package tasks;

public class Task11 {
	public static void findUniqueElments(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {
			int repeat = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					repeat++;
				}
			}
			if (repeat == 1) {
				System.out.println(numbers[i] + " is appear ounce");
			}

		}

	}

	public static void main(String[] args) {
		int[] elments = { 12, 22, 22, 33, 4, 12 };
		findUniqueElments(elments);

	}

}
