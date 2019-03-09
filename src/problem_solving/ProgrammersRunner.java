package problem_solving;

import java.util.*;

class ProgrammersRunner {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < completion.length; i++) {
			list.add(completion[i]);
		}
		for (int i = 0; i < participant.length; i++) {
			boolean isIt = false;
			int aSize = list.size();

			for (int j = 0; j < aSize; j++) {
				if (participant[i].equals(list.get(j))) {
					isIt = true;
					// System.out.println(list.get(j));
					list.remove(j);
					break;
				}
			}
			if (isIt == false) {
				answer = participant[i];
			}

			isIt = true;
		}

		return answer;
	}

	public static void main(String[] args) {
		ProgrammersRunner t = new ProgrammersRunner();
		String[] a = { "mislav", "stanko", "mislav", "ana" };
		String[] b = { "stanko", "ana", "mislav" };
		System.out.println(t.solution(a, b));
	}
}
