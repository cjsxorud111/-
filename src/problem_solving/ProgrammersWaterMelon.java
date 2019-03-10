package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ProgrammersWaterMelon {
	public static boolean solution(String s) {
		boolean answer = true;
		if (s.length() == 4 || s.length() == 6) {
			try {
				int a = Integer.parseInt(s);
			} catch (Exception e) {
				return false;
			}	
			return true;
		}
		answer = false;
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("aasad"));
	}
}
