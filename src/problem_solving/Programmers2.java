package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution05 {
	public String[] solution(String[] card, String[] word) {
		String[] answer = {};
		ArrayList<String> answerList = new ArrayList<String>();

		for (int i = 0; i < word.length; i++) {
			ArrayList<Character> firstList = new ArrayList<Character>();
			ArrayList<Character> tempList = new ArrayList<Character>();
			int temp = 0;
			for (int j = 0; j < word[i].length(); j++) {
				firstList.add(word[i].charAt(j));
			}

			for (int j = 0; j < card.length; j++) {
				ArrayList<Character> secondList = new ArrayList<Character>();

				for (int k = 0; k < card[j].length(); k++) {
					secondList.add(card[j].charAt(k));
				}

				secondList.retainAll(firstList);

				if (secondList.size() == 0) {
					temp++;
					break;
				}

				for (int k = 0; k < secondList.size(); k++) {
					tempList.add(secondList.get(k));
				}
			}

			System.out.println(firstList.toString());
			System.out.println(tempList.toString());

			
			System.out.println(firstList.toString());
			int num = 0;

			try {

				if (firstList.size() >= tempList.size()) {
					firstList.retainAll(tempList);
					for (int j = 0; j < word[i].length(); j++) {
						if (word[i].charAt(j) == firstList.get(j)) {
							num++;
						}
					}
				} else {
					tempList.retainAll(firstList);
					for (int j = 0; j < word[i].length(); j++) {
						if (word[i].charAt(j) == tempList.get(j)) {
							num++;
						}
					}
				}
			} catch (Exception e) {
				continue;
			}

			if (num == word[i].length() && temp == 0) {
				answerList.add(word[i]);
				System.out.println("oo");
			}
		}

		if (answerList.size() == 0) {
			answerList.add("-1");
		}

		answer = answerList.toArray(new String[answerList.size()]);
		return answer;
	}
}

public class Programmers2 {
	public static void main(String[] args) {
		Solution05 sol = new Solution05();

		String[] word = { "AAAKKKKKMMMMM", "ABCDKJ" };
		String[] card = { "AABBCCDD", "KKKKJJJJ", "MOMOMOMO" };

		// String[] card = { "ABACDEFG", "NOPQRSTU", "HIJKLKMM"};
		// String[] word = { "GPQM", "GPMZ", "EFU", "MMNA"};

		System.out.println(Arrays.toString(sol.solution(card, word)));
	}
}
