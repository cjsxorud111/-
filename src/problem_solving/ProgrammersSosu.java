package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution02 {
	public int solution(String numbers) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < numbers.length(); i++) {
			int num = numbers.charAt(i)-'0';
			System.out.println(num);
		}
        
        
        
        return answer;
	}
}

public class ProgrammersSosu {

	public static void main(String[] args) {
		Solution02 sol = new Solution02();
		String st = "1734";
		System.out.println(sol.solution(st));
	}
}
