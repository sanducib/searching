package algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = {2, 9, 5, 4, 8, 1, 6};
		System.out.println(Arrays.toString(array).toString());
		int[] sortedArray = startInsertionSort(array);
		System.out.println(Arrays.toString(sortedArray).toString());

	}
	
	public static int[] startInsertionSort(int[] a) {
		
		for(int i = 1 ; i < a.length ; i++) {
			int currentElement = a[i];
			int k = 0;
			for( k = i-1 ; k>=0 && a[k]>currentElement ;k--) {
				a[k+1] = a[k];
			}
			a[k+1] = currentElement;
			
		}
		
		return a;
	}

}
