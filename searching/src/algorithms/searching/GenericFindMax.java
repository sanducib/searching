package algorithms.searching;

public class GenericFindMax {

	public static void main(String[] args) {

		Integer[] a = {1 , 3 , 4 , 6 , 8 , 7 , 2};
		Integer maxVal = findMax(a);
		System.out.println(maxVal);

	}
	
	public static <T extends Comparable<T>> T findMax(T[] array) {
		
		T max = array[0];
		
		for(T data : array) {
			
			if(data.compareTo(max)>0)
				max = data;
		}
		
		return max;		
	}

}
