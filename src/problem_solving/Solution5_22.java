package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution5_22 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        ArrayList<String> cList = new ArrayList<>(Arrays.asList(completion));
        Collections.sort(cList);
        
        for (int i = 0; i < participant.length; i++) {
        	int a = Collections.binarySearch(cList, participant[i]);
        	System.out.println(cList.toString());
        	if (a >= 0) {
				cList.remove(a);
			} else {
				answer = participant[i];
			}
		}
        return answer;
    }
    
    public static void main(String[] args) {
		String[] p = {"mislav", "stanko", "mislav", "ana"};
		String[] c = {"stanko", "ana", "mislav"};
		
		Solution5_22 s = new Solution5_22();
		System.out.println(s.solution(p, c));
	}
}