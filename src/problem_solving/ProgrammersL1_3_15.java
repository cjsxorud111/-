package problem_solving;

class ProgrammersL1_3_15 {
	public int solution(int n) {
        int answer = 0;
        String temp  = String.valueOf(n);
        int num = 1;
        for (int i = 1; i < temp.length(); i++) {
			num *= 10;
		}
        
        while(num > 0) {
        	answer += n/num;
        	n = n%num;
        	num /= 10;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		ProgrammersL1_3_15 oneTwoFour = new ProgrammersL1_3_15();
		
		int s = 987;
		
		System.out.println(oneTwoFour.solution(s));
	}
}
