package problem_solving;

class ProgrannersL13_15 {
	public String solution(String s) {
		String answer = "";
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			
			
			if (s.charAt(i) != ' ') {
				if (num%2 == 0) {
					answer += Character.toUpperCase(s.charAt(i));
				} else if(num%2 == 1) {
					answer += Character.toLowerCase(s.charAt(i));
				}
				num++;
			}else {
				answer += s.charAt(i);
				num = 0;
			}
			
		}
		
		return answer;
	}

	public static void main(String[] args) {
		ProgrannersL13_15 oneTwoFour = new ProgrannersL13_15();

		String s = "   try    he   werewr llo     worl  d";

		System.out.println(oneTwoFour.solution(s));
	}
}
