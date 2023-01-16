package tasks;

public class Task16 {

	public static void findOccurance(int[] input, int value) {
		int count = 0; 
		for (int i = 0; i < input.length; i++) {
			
			if (input[i] == value && value > 10) {
				count++;

			}
		}
		System.out.print(count);
	}
	
	public static void main(String[] args) {
		int [] array = {1, 2, 15, 20, 15, 30, 20, 15, 15};
		int val = 15 ;
		System.out.println("The number "+ val );
		findOccurance(array,val);
		System.out.println(" times appear ");

	}

}
