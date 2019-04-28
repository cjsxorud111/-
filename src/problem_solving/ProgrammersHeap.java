package problem_solving;

import java.util.PriorityQueue;

public class ProgrammersHeap {
	public static int solution(int[] scoville, int K) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		int count = 0;

		for (int i = 0; i < scoville.length; i++) {
			q.add(scoville[i]);
		}

		System.out.println(q);

		for (int i = 0; i < scoville.length-1; i++) {
			if (q.peek() < K) {
				q.add(q.poll() + q.poll() * 2);
			}
			count++;
			if (q.peek() >= K)
				break;
			
		}
		
		if(count == scoville.length-1 && q.peek() < K) {
			count = -1;
		}
		if(scoville.length < 1) {
			count = -1;
		}

		return count;
	}

	public static void main(String[] args) {
		int[] sco = { 1, 2, 3, 9, 10, 12 };

		System.out.println(solution(sco, 7));

	}

}
