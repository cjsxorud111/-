package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution04 {
	public int solution(int[][] matrix) {
		int answer = 0;
		ArrayList<Integer> firstList = new ArrayList<Integer>();
		ArrayList<Integer> secondList = new ArrayList<Integer>();
		
		for (int i = 0; i < matrix.length; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < matrix[0].length; j++) {
				list.add(matrix[i][j]);
			}
			Collections.sort(list);
			firstList.add(list.get((list.size()-1)/2));
		}
		
		for (int i = 0; i < matrix.length; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < matrix[0].length; j++) {
				list.add(matrix[j][i]);
			}
			Collections.sort(list);
			secondList.add(list.get((list.size()-1)/2));
		}

		firstList.retainAll(secondList);
		
		return firstList.size();
	}
}

public class Programmers {
	public static void main(String[] args) {
		Solution04 sol = new Solution04();

		int[][] matrix = { { 4,2,9},{1,3,5},{6,8,7} };

		System.out.println(sol.solution(matrix));
	}
}
