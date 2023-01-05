package ex1;

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

	public static void main(String[] args) {
		String[] input = { "Atyab", "Fatima", "Saeed", "Abdullah", "Malak", "Fatima", "Daniyal", "atyab", "Abdullah",
				"Abdullah" };
		String[] out = findOccurance(input);
		for (String element : out) {
			System.out.println( element );
		}
	}

}
