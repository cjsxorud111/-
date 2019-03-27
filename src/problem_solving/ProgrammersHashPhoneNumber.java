package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

class Solution{
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        // 작은순서로 정렬
    	//앞 문자열부터 자기보다큰 문자열과 앞부터 자기크기만만 비교
    	//있으면 break
        HashMap<Integer, String> map = new HashMap<Integer, String>(); 
        
        for (int i = 0; i < phone_book.length; i++) {
			map.put(phone_book[i].length(), phone_book[i]);
		}
        
        System.out.println(map.toString());
        
        Iterator<Integer> iteratorKey = map.keySet( ).iterator( );   //키값 오름차순 정렬(기본)



        while(iteratorKey.hasNext()) {

          Integer key = iteratorKey.next();

          System.out.println(key+","+map.get(key));

         }



        
        
        
        
        return answer;
    }
}

public class ProgrammersHashPhoneNumber {
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] st = {"97674223", "119", "123","1232", "1195524421"};
		System.out.println(sol.solution(st));
	}
}
