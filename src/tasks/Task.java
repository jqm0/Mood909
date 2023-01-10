package tasks;

import java.util.HashSet;

public class Task {
	public static String[] findOccurance(String[] input) {
		String[] output = new String[9];

		for (int i = 0; i < input.length; i++) {
			int count = 0;
			for (int j = i + 1; j < input.length; j++) {

				if (input[i].equalsIgnoreCase(input[j])) {
					count++;

				}
				output[i] = input[i] + " is repeated " + count + " times";
			}

		}

		return output;

	}

	public static void findOccuranceHashSet(String[] input) {
		HashSet<String> hSet = new HashSet<String>();
		String[] input1 = { "Atyab", "Fatima", "Saeed", "Abdullah", "Malak", "Fatima", "Daniyal", "atyab", "Abdullah",
				"Abdullah" };
		for (int i = 0; i < input1.length; i++) {
			int count = 0;
			for (int j = i + 1; j < input1.length; j++) {

				if (input1[i].equalsIgnoreCase(input1[j])) {

					count++;
					hSet.add(input1[i] + " is repeated " + count + " times");
					System.out.println(hSet);

				}
			

			}

		}

	}

	public static void main(String[] args) {
		String[] input = { "Atyab", "Fatima", "Saeed", "Abdullah", "Malak", "Fatima", "Daniyal", "atyab", "Abdullah",
				"Abdullah" };
		System.out.println("======= Using HashSet =======");
		findOccuranceHashSet(input);
		System.out.println("-----------------------------");
		System.out.println("======= Using array =======");
		String[] out = findOccurance(input);
		for (String element : out) {
			System.out.println(element);
		}

	}

}
