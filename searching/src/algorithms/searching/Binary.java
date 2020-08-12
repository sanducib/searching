package algorithms.searching;

public class Binary {

	public static void main(String[] args) {
		
		int[] array = {0,1, 2, 3, 4, 5, 6};
		int key = 3;
		int index = classicBinarySearch(array , key); 
		System.out.println(index);
		int index2 = binarySearch(array , key);
		System.out.println(index2);
	}
	
	public static int binarySearch(int[] a , int key) {
		
		int low = 0 ; 
		int high = a.length -1;
		return recursiveBinarySearch(a , key , low , high);
	}
	
	public static int recursiveBinarySearch(int[] a , int key , int low , int high) {
		
		if(low>high) {
			return -low-1;
		}
		
		int middle = (low + high)/2;
		if(a[middle] < key) {
			return recursiveBinarySearch(a , key , low , middle -1);
		}
		else if(a[middle]==key) {
			return middle;
		}else {
			return recursiveBinarySearch(a , key , middle+1 , high);
		}
		
	}
	
	public static int classicBinarySearch(int[] a , int key) {
		int low = 0 ; 
		int high = a.length-1;
		
		while(high>=low) {
			int middle = (low + high) / 2;
			if(a[middle] < key)
				low = middle +1;
			else if(a[middle] > key)
				high = middle -1;
			else if(a[middle] == key) {
				return middle;
			}
		}
		return -1;
	}

}
