package problem_solving;

class ProgrammersL13_15 {
	public String solution(String s, int n) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char asc = ' ';

			if (s.charAt(i) != ' ') {
				int ascii = (int) s.charAt(i);

				if (ascii + n > 122) {
					asc = (char) (ascii + n - 26);
				} else if (ascii + n < 97 && ascii + n > 90) {
					asc = (char) (ascii + n - 26);
				} else {
					asc = (char) (ascii + n);
				}
			}
			answer = answer + asc;
		}

		return answer;
	}

	public static void main(String[] args) {
		ProgrammersL13_15 oneTwoFour = new ProgrammersL13_15();

		String s = "ZZZZZZZZZZZ zzzzzzzzzz";
		int n = 1;
		System.out.println(oneTwoFour.solution(s, n));
	}
}
