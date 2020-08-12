package algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = { 2, 9, 5, 4, 8, 1, 6 };
		System.out.println(Arrays.toString(array).toString());
		int[] sortedArray = startBubbleSort(array);
		System.out.println(Arrays.toString(sortedArray).toString());

	}

	public static int[] startBubbleSort(int[] a) {
		for (int k = 1; k < a.length; k++) {
			for (int i = 0; i < a.length - k; i++) {

				if (a[i] > a[i + 1]) {
					swap(i , a);
					// int temp = a[i];
					// a[i]= a[i+1];
					// a[i+1] = temp;
				}
			}
		}
		return a;
	}

	public static void swap(int index, int[] a) {
		int temp = a[index];
		a[index] = a[index+1];
		a[index+1] = temp;
	}

}
