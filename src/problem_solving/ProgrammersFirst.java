package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ProgrammersFirst {
	private static ArrayList<Integer> arrayList;

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = {};
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		for (int j = 0; j < commands.length; j++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int temp = 0;
			System.out.println(commands.length);
			
			for (int i = 0; i < array.length; i++) {
				//System.out.println(commands[j][0]+"요기"+commands[j][1]);

				if (commands[j][0]-1 <= i && i <= commands[j][1]-1) {
					//System.out.print(array[i]);
					list.add(array[i]);
				} 
			}
			System.out.println(" ");
			Collections.sort(list);
//			System.out.println(list.toString());
			if (list.size()>=commands[j][2]) {
				//System.out.println(commands[j][2]+"여기?");
				resultList.add(list.get(commands[j][2]-1));
				
			}else {
				//System.out.println(list.toString());
				resultList.add(list.get(0));
			}
		}
		answer = new int[resultList.size()]; 
		for (int i = 0; i < resultList.size(); i++) {
			answer[i] = resultList.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] A = { 1, 4,5,2,3,9};
		int[][] B = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 }, { 3, 7, 1 } };
		System.out.println(Arrays.toString(solution(A, B)));
	}
}
