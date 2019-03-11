package problem_solving;

import java.util.Arrays;

class ProgrammersL2Stock {
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		for (int i = 0; i < prices.length; i++) {
			int a = -1;
			for (int j = i; j < prices.length; j++) {
				a++;
				if (prices[i] > prices[j]) {
					answer[i] = a;
					break;
				}
			}
			answer[i] = a;
		}
		return answer;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		ProgrammersL2Stock oneTwoFour = new ProgrammersL2Stock();

		int[] val = { 1, 2, 3, 2, 3 };
		System.out.println(Arrays.toString(oneTwoFour.solution(val)));
	}
}
