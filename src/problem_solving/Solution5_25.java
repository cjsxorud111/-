package problem_solving;

import java.util.LinkedList;

class Solution5_25 {
	public int solution(int[] priorities, int location) {
        int answer = 0;
        
        LinkedList<Integer> q = new LinkedList<Integer>();
        LinkedList<Integer> q2 = new LinkedList<Integer>();
        for (int i = 0; i < priorities.length; i++) {
			q.add(priorities[i]);
			q2.add(i);
		}
        boolean isOut = false;
        while(true) {
        	int first = q.get(0);
        	int first2 = q2.get(0);
			q.remove(0);
			q2.remove(0);
			boolean bigNum = false;
			isOut = false;
			for (int j = 0; j < q.size(); j++) {
				if(q.get(j) > first) {
					System.out.println(first);
					q.add(first);
					q2.add(first2);
					bigNum = true;
					break;
				}
			}
			if(bigNum == false) {
				answer++;
				isOut = true;
			}
			if (first2 == location&&isOut == true) {
				break;
			}
		}
        return answer;
    }
    
    public static void main(String[] args) {
    	int [] p = {2, 2, 2, 1, 3, 4};
		
		Solution5_25 s = new Solution5_25();
		System.out.println(s.solution(p, 3));
	}
}