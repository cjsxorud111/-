package reference;

import java.util.Arrays;

public class SortApi {
	
	public static void main(String[] args) {
		int[] array1 = new int[] {9,10,2,1,4,3,5,7,6,8};
		String[] array2 = new String[] {"f","b","a","d","c","e","g"};

		Arrays.sort(array1);
		Arrays.sort(array2);

		for (int i = 0; i < array2.length; i++) {
		    System.err.print(array2[i] + " ");
		
		}
	}
}
