package algorithms.searching;

public class Linear {

	public static void main(String[] args) {

		int[] array = {1, 4, 2, 5, -3, 6, 2};
		int key = 15;
		int index = linearSearch(array , key);
		System.out.println(index);

	}
	
	private static int linearSearch(int[] a , int key) {
		System.out.println(a.length);
		int index = -1;
		for(int i = 0 ; i<a.length ; i++) {
		    if(a[i] == key) {
		    	index = i;
		    	break;
		    }
		    
		}
		return index;
	}

}
