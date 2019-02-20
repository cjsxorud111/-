package problem_solving;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
	public static int solution(int[] A) {
		int result = 0;
		int aa = 0;
		int bb = 0;
		if (A.length >= 2) {
					
			for (int i = 0; i < A.length-3; i++) {
	
				if (A[i] > A[i + 1] && A[i + 1] < A[i + 2] && A[i + 2] > A[i + 3]) {
					System.out.println(A[i]+"ddd");
					result++;
					if(i < A.length-3) {
						if(A[i+3] >= A[i+4]) {
							result = result+3;
							System.out.println(A[i]+"ddd");
						}
					}
					
				}
				if (A[i] < A[i + 1] && A[i + 1] > A[i + 2] && A[i + 2] < A[i + 3]) {
					System.out.println(A[i]);
					
					result++;
					if(i < A.length-4) {
						if(A[i+3] <= A[i+4]) {
							result = result+3;
							System.out.println(A[i]+"ddd??");
							if(i+4 == A.length) {
								result = result+3;
							}
						}
		
					}
					
					
				}
				
			}
			
			if(result==0) {
				result = 2;
			}
		
		}
		
		if(A.length == 1) {
			result = 1;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] cc = { 9, 4, 2, 10, 7, 8, 8, 1, 9 };
		System.out.println(solution(cc));

	}
}
