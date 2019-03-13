package problem_solving;

import java.util.Stack;

class ProgrammersL2SteelStick {
	public int solution(String arrangement) {
		int answer = 0;

		Stack<Character> stack = new Stack<Character>();
		int count = 0;
		int stackOut = 0;
		for (int i = 0; i < arrangement.length(); i++) {
			if (arrangement.charAt(i) == '(') {
				stack.push(')');
			}else {
				stack.pop();
				if (arrangement.charAt(i-1) == ')') {
					answer += 1;
				} else {
					answer += stack.size();
				}
			}
			
			//���� �̿����� ���� Ǯ��
			/*if (arrangement.charAt(i) == '(') {
				stack.push(')');
				count++;
				stackOut = 0;
			} else if (arrangement.charAt(i) == ')'){
				stackOut+=1;
				
				if (stackOut > 1) {
					answer+=1;
					count -- ;
					continue;
				}else {
					count -- ;
					answer+=count;	
				}
			} */
		}
		return answer;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		ProgrammersL2SteelStick oneTwoFour = new ProgrammersL2SteelStick();
		String sol = "()(((()())(())()))(())";
		System.out.println(oneTwoFour.solution(sol));
	}
}
