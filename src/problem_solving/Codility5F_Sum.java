package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Codility5F_Sum {
	static int solution(int[] A) {

		int result = 0;
		List<Integer> li = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] == 0)li.add(i);
			else sum++;
		}
		System.out.println(li.toString());
		for (int i = 0; i < li.size(); i++) {
			result = result + (A.length - (li.get(i)+1)-(li.size()-(i+1))); 
		}
		if(Math.abs(result)> 1000000000) {
			return -1;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] A = { 0, 1, 0, 1, 1 };
		System.out.println(solution(A));
	}
}