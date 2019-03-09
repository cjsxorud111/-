package problem_solving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

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
		//System.out.println(list.toString());
		for (int j = 0; j < M.length; j++) {
			list.remove(M[j]);
		}
		int count = 0;
		ArrayList<Integer> result = new ArrayList<Integer>(); // 결과값
		//System.out.println(list.toString() + "???");
		for (int i = 1; i <= E.length(); i++) {
			int a = (int) (E.charAt(E.length() - i) - '0');
			int pa = 11; // 최대값
			int ma = 0; // 최소값
			//System.out.println(a + "여기");
			for (int j = 0; j < list.size(); j++) {
				int b = Integer.parseInt(list.get(j));
				if (b < a && b > pa) {
					pa = b;
					//System.out.println(pa + "vv");
				} else if (b >= a) {
					ma = b;
					//System.out.println(ma + "tt");
					break;
				}
			}

			if (pa == 11) {
				result.add(ma);
				count++;
				
			} else {

				if (i < E.length()) {
					if (a - pa < ma - a) {
						result.add(pa);
						count++;
					} else {
						result.add(ma);
						count++;
					}
				} else {
					if (pa == 0) {
						result.add(ma);
						count++;
					} else if (a - pa < ma - a) {
						result.add(pa);
						count++;
					} else {
						result.add(ma);
						count++;
					}
				}
			}
			//System.out.println(result.toString()+"  "+count);
			
			pa = 0;
		}
		Stack<Integer> stack = new Stack<Integer>();
		for (int j = 0; j < result.size(); j++) {
			stack.push(result.get(j));
			System.out.println("??"+j);
		}
		String aa = "";
		
		
		for (int j = 0; j < result.size(); j++) {
			aa = aa+String.valueOf(stack.pop());
		}
		
		int bb = Integer.parseInt(aa);
		int EE = Integer.parseInt(E);
		//System.out.println(" as"+aa);
		int rresult = 0;
		int rr = 0;
		if (EE > bb) {
			rr = EE - bb;
			rresult = rr+count;
			System.out.println("??1");
		}else if (EE < bb){
			rr = bb - EE;
			rresult = rr+count;
			System.out.println("??2"+bb);
		}else {
			rr = 0;
			System.out.println("??3");
		}
		
		if(EE == 100) {
			rresult = 0;
			System.out.println("??4");
		}
		System.out.println(rresult);
	}
}
