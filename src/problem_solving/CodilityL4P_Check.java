package problem_solving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CodilityL4P_Check {

	public static void main(String[] args) {
		int[] arr = { 4, 1, 3, 2 };
		int[] arr1 = { 4, 4,4,4,4 };
		
		Arrays.sort(arr1);
		Set<Integer> set = new HashSet<Integer>();
		for (int i : arr1) {
			set.add(i);
		}
		System.out.println(set.toString());
		Integer[] a = set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(arr1));
		int result = 1;
		
		if (a.length > 2) {
			System.out.println(Arrays.toString(a));
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i + 1] != a[i] + 1)
					result = 0;
			}
			System.out.println(result);
		}else{
			result = 0;
		}
		System.out.println(result);
	}
}