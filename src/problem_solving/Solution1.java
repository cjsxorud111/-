package problem_solving;

import java.util.Arrays;

public class Solution1 {
	public static int solution(int[] A) {
        
		int result = 0;
		
		for (int i = 0; i < A.length; i++) {
			
			int []B = new int[i+1];
			int []C = new int[i+1];
			
			for (int k = 0; k < i+1; k++) {
				C[k] = A[k];
			}
				
			for (int j = 0; j <= i; j++) {
				System.out.println(j);
				
				
				Arrays.sort(C);
				
				B[j] = j+1;
				
				if (Arrays.equals(B, C)==true){
					result++;
				}
				
			}
		}
		
		
		
		return result;
    }
	
	
	public static void main(String[] args) {
		int []cc = {2,1,3,5,4};
		System.out.println(solution(cc));
		

	}
}
