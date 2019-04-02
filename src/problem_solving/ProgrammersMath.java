package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

class Solution01 {
	public int[] solution(int[] answers) {
		int[] student1 = { 1, 2, 3, 4, 5 };
		int[] student2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] student3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int st1 = 0; int st2 = 0; int st3 = 0;

		int stans1 = 0; int stans2 = 0; int stans3 = 0;

		for (int i = 0; i < answers.length; i++) {

			if (student1[st1] == answers[i]) stans1++;
			if (student2[st2] == answers[i]) stans2++;
			if (student3[st3] == answers[i]) stans3++;

			st1++; st2++; st3++;
			if (st1 == student1.length) st1 = 0;
			if (st2 == student2.length) st2 = 0;
			if (st3 == student3.length) st3 = 0;

		}

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(stans1); list.add(stans2); list.add(stans3);

		Collections.sort(list);

		ArrayList<Integer> list02 = new ArrayList<Integer>();
		if (stans1 == list.get(list.size()-1)) list02.add(1);
		if (stans2 == list.get(list.size()-1)) list02.add(2);
		if (stans3 == list.get(list.size()-1)) list02.add(3);
		
		int[] array = new int[list02.size()];
		
		for (int j = 0; j < list02.size(); j++) array[j] = list02.get(j);

		return array;
	}
}

public class ProgrammersMath {

	public static void main(String[] args) {
		Solution01 sol = new Solution01();
		int[] st = { 1,3,2,4,2 };
		System.out.println(Arrays.toString(sol.solution(st)));
	}
}
