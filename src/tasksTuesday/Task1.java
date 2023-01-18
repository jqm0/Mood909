package tasksTuesday;

public class Task1 {

	public static int[] createStack(int sizeOfStack) {
		int[] stack = new int[sizeOfStack];

		System.out.println("The Stack is ready to use :) ");
		return stack;

	}

	public static void push(int number, int[] array) {

		for (int i = 0; i < array.length-1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				array[j] = array[i];
			
			}
			
			
		}
		array[0] = number;
		System.out.println("The number " + number + " Has been pushed to the array");
	}

	public static void pop(int[] array) {
		System.out.println("The number " + array[array.length - 1] + " Has been poped out from the array");
		array[array.length - 1] = 0;
	}

	public static void display(int[] array) {
		System.out.print("The stack has this element : ");
		for (int element : array) {
			System.out.print(element + " ");
		}
		System.out.println("");
	}
	
	public static void getMiddle(int[] array) {
			int middleElement = array.length/2;
			System.out.println(array[middleElement]);
		
	}
	public static void main(String[] args) {
		// Implement a stack data structure in Java using an array, with push and pop
		// operations.
		int[] array = createStack(3);
		push(5, array);
		push(3, array);
		push(1, array);
		display(array);
		pop(array);

	}

}
