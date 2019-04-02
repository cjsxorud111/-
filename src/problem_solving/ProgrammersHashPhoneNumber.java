package problem_solving;

class Solution{
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for (int i = 0; i < phone_book.length-1; i++) {
			for (int j = i+1; j < phone_book.length; j++) {
				if (phone_book[j].startsWith(phone_book[i])) {
					return false;  
				}
			}
		}
        
        return answer;
    }

}

public class ProgrammersHashPhoneNumber {
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] st = {"119", "97674223", "1195524421"};
		System.out.println(sol.solution(st));
	}
}
