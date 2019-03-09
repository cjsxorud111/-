package problem_solving;

import java.util.*;

class ProgrammersMathP {
	public int[] solution(int[] answers) {
		int[] answer = {};
		int[] first = { 1, 2, 3, 4, 5 };
		int[] second = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] third = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int firstNum = 0;
		int secondNum = 0;
		int thirdNum = 0;
		int firstCol = 0;
		int secondCol = 0;
		int thirdCol = 0;

		for (int i = 0; i < answers.length; i++) {
			if (i == first.length) {
				firstNum = 0;
			}
			if (i == second.length) {
				secondNum = 0;
			}
			if (i == third.length) {
				thirdNum = 0;
			}
			if (answers[i] == first[firstNum]) {
				firstCol++;
			}
			if (answers[i] == second[secondNum]) {
				secondCol++;
			}
			if (answers[i] == third[thirdNum]) {
				thirdCol++;
			}
			firstNum++;
			secondNum++;
			thirdNum++;
		}
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(1, firstCol);
		map.put(2, secondCol);
		map.put(3, thirdCol);
		Iterator iterator = map.keySet().iterator();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(map.get(1) == map.get(2) && map.get(2) == map.get(3)) {
			answer = new int[3];
			answer[0] = 1;
			answer[1] = 2;
			answer[2] = 3;
		} else if(map.get(1) == map.get(2)) {
			answer = new int[2];
			answer[0] = 1;
			answer[1] = 2;
		}else {
			answer = new int[1];
			answer[0] = 1;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		ProgrammersMathP t = new ProgrammersMathP();
		int[] a = {6,7,8};
		System.out.println(Arrays.toString(t.solution(a)));
	}
}
