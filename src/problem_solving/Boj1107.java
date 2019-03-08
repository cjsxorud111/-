package problem_solving;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import java.util.Map.Entry;

class Boj1107 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String E = scanner.next();
		int S = scanner.nextInt();
		String[] M = new String[S];

		for (int i = 0; i < S; i++) {
			M[i] = scanner.next();
		}
		int[] noo = new int[10 - M.length - 1];

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}
		System.out.println(list.toString());
		for (int j = 0; j < M.length; j++) {
			list.remove(M[j]);
		}

		ArrayList<Integer> result = new ArrayList<Integer>(); // 결과값
		System.out.println(list.toString() + "???");
		for (int i = 1; i <= E.length(); i++) {
			int a = (int) (E.charAt(E.length() - i) - '0');
			int pa = 11; // 최대값
			int ma = 0; // 최소값
			System.out.println(a + "여기");
			for (int j = 0; j < list.size(); j++) {
				int b = Integer.parseInt(list.get(j));
				if (b < a && b > pa) {
					pa = b;
					System.out.println(pa + "vv");
				} else if (b >= a) {
					ma = b;
					System.out.println(ma + "tt");
					break;
				}
			}

			if (pa == 11) {
				result.add(ma);
			} else {

				if (i < E.length()) {
					if (a - pa < ma - a) {
						result.add(pa);
					} else {
						result.add(ma);
					}
				} else {
					if (pa == 0) {
						result.add(ma);
					} else if (a - pa < ma - a) {
						result.add(pa);
					} else {
						result.add(ma);
					}
				}
			}

			System.out.println(result.toString());
			pa = 0;
		}
	}
}
