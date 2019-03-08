package problem_solving;

import java.util.ArrayList;
import java.util.Stack;

public class Codility8Dominator {

	static public int solution(int[] A) {
		int result = 1;
		
		if (A.length<2) {
			return -1;
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (A.length%2 == 0) {
			int index = (A.length)/2;
			for (int i = 0; i < A.length; i++) {
				if (A[i]==A[index]) {
					return i;
				}
			}
		}else{
			int index = (A.length-1)/2+1;
			for (int i = 0; i < A.length; i++) {
				if (A[i]==A[index]) {
					return i;
				}
			}
		}
		
        return result;
    }

	public static void main(String[] args) {
		int[] A = {3,4,3,2,3,-1,3,3};
		
		System.out.println(solution(A));
	}
}