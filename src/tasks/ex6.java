package tasks;

import java.util.Arrays;

public class ex6 {
	public static int removeDublicates(int[] arrayA , int size) {
		if (size == 0 || size ==1) {
			return size;
		}
		int [] uniqueElements = new int[size];
		int index = 0;
		for(int i = 0 ; i < size-1 ; i++) {
			if(arrayA[i] != arrayA[i+1]) {
				 uniqueElements[index++] = arrayA[i];
			}
		}
		uniqueElements[index++] = arrayA[size-1];
		for(int i = 0 ; i< index ; i ++) {
			arrayA[i] = uniqueElements[i];
			
		}
		System.out.println("New array size :" + index);
		System.out.println("The array without dublicates :");
		return index;
		
	}
	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,3,2,1,22};
		System.out.println("The orginal array is :");
		for(int number : numbers ) {
			System.out.println(number);
		}
		
		Arrays.sort(numbers);
		int size = numbers.length;
		size = removeDublicates(numbers,size);
		for (int i =0 ; i < size ; i ++) {
			System.out.println(numbers[i]);
		}
	}

}
