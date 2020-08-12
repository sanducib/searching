package algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {2, 9, 5, 4, 8, 1, 6};
		System.out.println(Arrays.toString(array).toString());
		int[] sortedArray = startSelectionSort(array);
		System.out.println(Arrays.toString(sortedArray).toString());

	}
	
	public static int[] startSelectionSort(int[] array) {
		
		for(int i = 0 ; i < array.length-1 ; i++) {
			for(int j = i+1 ; j < array.length ; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		return array;
	}

}
