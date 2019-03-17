package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;

class ProgrammersL1SportJersey2 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		ArrayList<Integer> canPtList = new ArrayList<Integer>();
		ArrayList<Integer> lostList = new ArrayList<Integer>();
		ArrayList<Integer> reserveList = new ArrayList<Integer>();

		for (int i : lost) {
			lostList.add(i);
		}

		for (int i = 1; i <= n; i++) {
			if (!lostList.contains(i)) {
				canPtList.add(i);
			}
		}
		
		for (int j = 0; j < reserve.length; j++) {
			if (lostList.contains(reserve[j]) == false) {
				reserveList.add(reserve[j]);
			} else {
				canPtList.add(reserve[j]);
			}
		}
		for (int i = 0; i < lostList.size(); i++) {
			if (canPtList.contains(lostList.get(i))) {
				lostList.remove(i);
			}
		}
		int[] reserveArr = new int[reserveList.size()];
		int[] lostArr = new int[lostList.size()];
		
		for (int i = 0; i < reserveList.size(); i++) {
			reserveArr[i]=reserveList.get(i);
		}
		for (int i = 0; i < lostList.size(); i++) {
			lostArr[i]=lostList.get(i);

		}
		
		for (int i = 0; i < reserveArr.length; i++) {
			for (int j = 0; j < lostArr.length; j++) {

				if (reserveArr[i] - 1  == lostArr[j] ) {
					canPtList.add(lostArr[j]);
					lostArr[j] = 0;
					reserveArr[i] = 0;
				} else if(reserveArr[i] + 1  == lostArr[j] ) {
					canPtList.add(lostArr[j]);
					lostArr[j] = 0;
					reserveArr[i] = 0;
				}
			}
		}
		return canPtList.size();
	}

	public static void main(String[] args) {
		ProgrammersL1SportJersey2 oneTwoFour = new ProgrammersL1SportJersey2();
		int n = 3;
		int[] lost = {2,3};
		int[] reserve = {1};

		System.out.println(oneTwoFour.solution(n, lost, reserve));
	}
}
