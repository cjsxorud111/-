package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;

class ProgrammersL1Test {
	public int[] solution(int[] answers) {
		int[] student1 = { 1, 2, 3, 4, 5 };
		int[] student2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] student3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int[] studentCol = new int[3];
		int student1Num = 0;
		int student2Num = 0;
		int student3Num = 0;

		for (int i = 0; i < answers.length; i++) {
			System.out.println(i+" "+student1Num);
			if (answers[i] == student1[student1Num]) {
				studentCol[0]++;
			}
			if (answers[i] == student2[student2Num]) {
				studentCol[1]++;
			}
			if (answers[i] == student3[student3Num]) {
				studentCol[2]++;
			}
			student1Num++;
			student2Num++;
			student3Num++;
			if (i >= student1.length - 1) {
				student1Num = 0;
			}
			if (i >= student2.length - 1) {
				student2Num = 0;
			}
			if (i >= student3.length - 1) {
				student3Num = 0;
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int temp = 0;
		
		for (int i = 0; i < studentCol.length; i++) {
			if (studentCol[i] >= temp) {
				temp = studentCol[i];
			}
		}
		for (int i = 0; i < studentCol.length; i++) { 
			if (temp == studentCol[i]) {
				list.add(i+1);
			}
		}
	
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		ProgrammersL1Test oneTwoFour = new ProgrammersL1Test();
		int[] answers = {2,1,2,1,2,2,4,4,4,5,2,1,2,1,2,2,4,4,4,5,2,1,2,1,2,2,4,4,4,5,2,1,2,1,2,2,4,4,4,5,2,1,2,1,2,2,4,4,4,5,2,1,2,1,2,2,4,4,4,5,2,1,2,1,2,2,4,4,4,5,2,1,2,1,2,2,4,4,4,5,2,1,2,1,2,2,4,4,4,5,2,1,2,1,2,2,4,4,4,5};
		System.out.println(Arrays.toString(oneTwoFour.solution(answers)));
	}
}
