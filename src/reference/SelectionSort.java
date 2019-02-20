package reference;

public class SelectionSort {
	
	static int[] selection(int[] A) {
		int[] result = A;
		int maxp = A.length; //끝부분
		int temp = 0; 
		
		for (int i = 0; i < A.length-1; i++) {
			
			int max = result[0];
			int index = 0; //바꾼위치
			
			for (int i1 = 0; i1 < maxp-1; i1++) {
				if (A[i1]>max) {
					max = A[i1];
					index = i1;
					
				}	
				
			}
			
			if(result[maxp-1]<=max) {
			temp = result[maxp-1];
			
			result[maxp-1] = max;
			result[index] = temp;
			}
			
			maxp--;
			
		}
		
		
		
		return result;
	}

	public static void main(String[] args) {
		int[] a = { 9, 31, 48, 73, 3, 65, 20, 29, 11, 15 };
		int[] b = selection(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(b[i]);
		}

		

	}

}
