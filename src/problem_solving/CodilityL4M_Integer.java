package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CodilityL4M_Integer {
	static int solution(int[] A) {
		
		System.out.println(Arrays.toString(A));
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i : A) {
			set.add(i);
		}
		System.out.println(set.toString());
		
		Integer[] a = set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(a[a.length-1]+1);
		
		int result = 1;
		
		for (int i = 0; i < a.length-1; i++) {
			if (a[i+1] != a[i]+1) {
				li.add(a[i]+1);
			}
		}
		
		Collections.sort(li);
		System.out.println(li.toString());
		for (int i = 1; i < li.size(); i++) {
			if (li.get(i-1) <= 1 && li.get(i) > 2) return 1;
			System.out.println(li.get(i-1));
			if (li.get(i-1) > 1) return li.get(i-1)%1000000;
	
		}
		
		if(li.size() == 1 && li.get(0) > 1) return li.get(0)%1000000;
		
		return result;
	}
	public static void main(String[] args) {
		int[] A = {-1, 1, 2, 3, 9999};
		System.out.println(solution(A));
	}
}