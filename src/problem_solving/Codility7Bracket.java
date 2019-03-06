package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Codility7Bracket {
	
	static int solution(String A) {
		String[] strArray = A.split("");

		int result = 0;
		System.out.println(strArray.length);
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		Stack<String> stack = new Stack<String>(); 
		for (int i = 0; i < strArray.length/2; i++) {
			System.out.println("ss");
			stack.push(strArray[i]);
		}
		
		for (int i = strArray.length/2; i < strArray.length; i++) {
			String a = stack.pop();System.out.println(a+" "+i+" "+ strArray[i]);
			if (a.equals("(")) {
				
				if(strArray[i].equals(")")) return 1;
			} else if (a.equals("{")) {
				
				if(strArray[i].equals("}")) return 1;
			} else if (a.equals("[")) {
				System.out.println("??");
				if(strArray[i].equals("]")) return 1;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		String A = "{[]}";
		
		System.out.println(solution(A));
	}
}