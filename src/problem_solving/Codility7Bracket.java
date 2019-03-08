package problem_solving;

import java.util.Stack;

public class Codility7Bracket {

	static int solution(String A) {
		if (A.length() == 0)
			return 1;

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < A.length(); i++) {
			System.out.println("??????");
			if (A.charAt(i) == '(') {
				stack.push(')');
			} else if (A.charAt(i) == '[') {
				stack.push(']');
			} else if (A.charAt(i) == '{') {
				stack.push('}');
			} else if (A.charAt(i) == ')' || A.charAt(i) == ']' || A.charAt(i) == '}') {
				if (stack.isEmpty() == true) {
					System.out.println("?");
					return 0;
				}
				else {
					char a = stack.pop();
					System.out.println(a + " " +i);
					if (a != A.charAt(i)) {
						System.out.println(a+" "+A.charAt(i));
						return 0;
					}
				}
			}
		}
		if (!stack.isEmpty()) {
			System.out.println("???");
			return 0;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		String A = "{[()()]}";
		System.out.println(solution(A));
	}
}