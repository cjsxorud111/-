package reference;

import java.util.ArrayList;
import java.util.Stack;

class BinaryToDecimal {
	public String change124(int n) {
		String answer = "";
		Stack<Integer> namo = new Stack<Integer>();
		int moc = n;
		for (int i = 0; i < n; i++) {
			namo.push(moc % 3);
			moc = moc / 3;
			//System.out.println(moc);
			
			if (moc <= 1 ) {
			//	System.out.println(moc);
				namo.push(moc);
				
				break;
			}
		}

		while(!namo.empty()) {
			answer = answer + String.valueOf(namo.pop());
		}
		System.out.println("??"+answer+"??");

		return answer;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		BinaryToDecimal oneTwoFour = new BinaryToDecimal();
		System.out.println(oneTwoFour.change124(7));
		//oneTwoFour.change124(10);
	}
}