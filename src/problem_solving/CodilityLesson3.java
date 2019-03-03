package problem_solving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import java.util.Set;

public class CodilityLesson3 {

	public static void main(String[] args) {
		int[] N = { 2, 3, 1, 5};
		Arrays.sort(N);
		Set<Integer> set = new HashSet<Integer>();

		System.out.println(Arrays.toString(N));
		for (int i : N) {
			set.add(i);
		}
		
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + ", ");
		}

		Integer[] a = set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length-1; i++) {
			if(a[i+1]!=a[i]+1) System.out.println(a[i]+1);
		}
	}
}