package tasks;

public class Task10 {
	
	public static void main(String[] args) {
		int [] numbers = {12,22,22,33,4,12};
		for(int i = 0 ; i < numbers.length ; i++ ) {
			for(int j = i + 1 ; j < numbers.length ; j ++) {
				if(numbers[i]== numbers[j]) {
					System.out.println("This number is dublicate " + numbers[i]);
				}
			}
		}
	}
}
