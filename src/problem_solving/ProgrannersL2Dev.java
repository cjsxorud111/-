package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;

class ProgrannersL2Dev {
	public int[] solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> answerList = new ArrayList<Integer>();
		int temp = 0;
		for (int i = 0; i < progresses.length; i++) {
			temp = (100 - progresses[i]) % speeds[i];
			if (temp == 0) {
				list.add((100 - progresses[i]) / speeds[i]);
			} else if (temp != 0) {
				list.add((100 - progresses[i]) / speeds[i] + 1);
			}

			if (i != 0) {
				if (list.get(i) < list.get(i-1)) {
					list.remove(i);
					list.add(list.get(i-1));
				}
			}
		}
		int tme = 1;
		
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) == list.get(i-1)) {
				tme++ ;
				
			} else if(list.get(i) != list.get(i-1)){
				answerList.add(tme);
				tme = 1;
			} 
			if(i == list.size()-1) {
				answerList.add(tme);
			}
		}
		
		int[] answer = new int[answerList.size()];
		for (int i = 0; i < answerList.size(); i++) {
			answer[i] = answerList.get(i);
		}
		
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		ProgrannersL2Dev oneTwoFour = new ProgrannersL2Dev();

		int[] val = { 93, 30, 55 };
		int[] limit = { 1, 30, 5 };
		System.out.println(Arrays.toString(oneTwoFour.solution(val, limit)));
	}
}
