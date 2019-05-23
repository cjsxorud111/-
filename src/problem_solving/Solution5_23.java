package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Solution5_23 {
	public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Integer> q = new LinkedList<Integer>();
        
        for (int i = 0; i < priorities.length; i++) {
			q.offer(priorities[i]);
		}
//        Iterator<Integer> itr = q.iterator();
//        while( itr.hasNext() )
//        {
//        	System.out.println(q.peek(itr.next()));
//        }
//        for (int i = 0; i < q.size(); i++) {
//			System.out.println(q.peek());
//		}
        Queue<Integer> qu = new LinkedList<Integer>();
        for(Integer str : q) {
        	qu.offer(str);
        }
                                                                       
        
        
        for(Integer str : q) {
        	Queue<Integer> que = q;
        	
        	while(!que.isEmpty()) {
            	System.out.println(que.poll());
            	
            }
        	System.out.println(q.poll());
        	
        }
        
//        for(Integer str : q) {
//
//        	
//
//        }
        //System.out.println(q.contains(4));
        
        return answer;
    }
    
    public static void main(String[] args) {
    	int [] p = {2, 1, 3, 2};
		
		Solution5_23 s = new Solution5_23();
		System.out.println(s.solution(p, 2));
	}
}