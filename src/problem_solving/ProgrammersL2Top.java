package problem_solving;

import java.util.Arrays;

class ProgrammersL2Top {
	public int[] solution(int[] heights) {
		int[] answer = new int[heights.length];

		for (int j = heights.length-1; j >= 0; j--) {
			for (int i = j-1; i >= 0 ; i--) {
				if(heights[i] > heights[j]) {
					answer[j] = i+1;
					break;
				}
			}
		}

		return answer;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		ProgrammersL2Top oneTwoFour = new ProgrammersL2Top();
		int[] sol = {3,9,9,3,5,7,2};
		System.out.println(Arrays.toString(oneTwoFour.solution(sol)));
	}
}
