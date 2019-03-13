package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Codility5F_GRQuery {
	@SuppressWarnings("deprecation")
	static int[] solution(String S, int[] P, int[] Q) {
		String[] arr = S.split("");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<String, Integer> has = new HashMap<String, Integer>();
		System.out.println(Arrays.toString(arr));
		map.put(1, "A");
		map.put(2, "C");
		map.put(3, "G");
		map.put(3, "T");

		map.get(P[0]);
		// พฦดิ
		has.put("A", 1);
		has.put("C", 2);
		has.put("G", 3);
		has.put("T", 4);
		int[] result = new int[P.length];
		for (int i = 0; i < P.length; i++) {
			String a = S.substring(P[i], Q[i] + 1);
			String[] arr1 = a.split("");
			System.out.println(Arrays.toString(arr1));
			result[i] = has.get(arr1[0]);
			for (int j = 0; j < arr1.length; j++) {
				if (has.get(arr1[j]) < result[i]) {
					result[i] = has.get(arr1[j]);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String S = "CAGCCTA";
		int[] P = { 2, 5, 0 };
		int[] Q = { 4, 5, 6 };

		System.out.println(Arrays.toString(solution(S, P, Q)));
	}
}