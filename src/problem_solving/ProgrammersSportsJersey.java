package problem_solving;

import java.util.ArrayList;
import java.util.HashSet;

class ProgrammersSportsJersey {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		ArrayList<Integer> lostList = new ArrayList<Integer>();
		ArrayList<Integer> nList = new ArrayList<Integer>();
		ArrayList<Integer> reserveList = new ArrayList<Integer>();
		ArrayList<Integer> haveJerseyList = new ArrayList<Integer>();
		HashSet<Integer> resultSet = new HashSet<Integer>();

		for (int i = 0; i < lost.length; i++) {
			lostList.add(lost[i]);
		}
		for (int i : reserve) {
			reserveList.add(i);
			
		}
		for (int i = 1; i <= n; i++) {
			nList.add(i);
			if (!lostList.contains(i)) {
				haveJerseyList.add(i);
			}
		}
		

		System.out.println(" "+lostList.toString());
		for (int i = 0; i < reserveList.size(); i++) {

			if (lostList.contains(reserveList.get(0)-1)) {
				reserveList.add(reserveList.get(0)-1);
				reserveList.remove(0);
				continue;
			} else if (lostList.contains(reserveList.get(0)+1)) {
				reserveList.add(reserveList.get(0)+1);
				reserveList.remove(0);
			} else if (lostList.contains(reserveList.get(0))) {
				haveJerseyList.add(reserveList.remove(0));
			}
		}

		System.out.println(reserveList.toString()+"??" +haveJerseyList.toString());
		
		for (int i = 0; i < haveJerseyList.size(); i++) {
			resultSet.add(haveJerseyList.get(i));
		}
		for (int i = 0; i < reserveList.size(); i++) {
			resultSet.add(reserveList.get(i));
		}
		
		System.out.println(resultSet.toString());
		return resultSet.size();
	}

	public static void main(String[] args) {
		ProgrammersSportsJersey t = new ProgrammersSportsJersey();
		int[] a = { 2,4,6,8};
		int[] b = { 1,5,7 };
		System.out.println(t.solution(10, a, b));
	}
}
