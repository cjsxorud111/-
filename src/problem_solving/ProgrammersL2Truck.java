package problem_solving;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class ProgrammersL2Truck {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		Queue<Integer> que = new LinkedList<Integer>();
		int temp = 0;
		int answer = 0;

		int an = 0;
		for (int i = 0; i < truck_weights.length; i++) {
			an++;
			System.out.println(an);
			if (i == 0) {
				temp = truck_weights[i];
				que.add(truck_weights[i]);
			} else if (que.size() <= bridge_length && truck_weights[i] + temp > weight) {

				if (i == truck_weights.length - 1) {
					System.out.println("zzzz" + "요2기");
					que.add(truck_weights[i]);
					answer += (que.size() + bridge_length);
					break;
				} else {
					answer += (que.size() + bridge_length);
					temp = truck_weights[i];
					while (!que.isEmpty()) {
						que.poll();
					}
				}
			} else if (que.size() <= bridge_length && truck_weights[i] + temp <= weight) {
				if (i == truck_weights.length - 1) {
					System.out.println("zzzz" + "요3기");
					que.add(truck_weights[i]);
					answer += (que.size() + bridge_length);
					break;
				} else {
					System.out.println("zzzz" + i + que.peek());
					que.add(truck_weights[i]);
					temp = truck_weights[i];
				}
			} else if (que.size() > bridge_length) {
				if (i == truck_weights.length - 1) {
					System.out.println("zzzz" + "요4기");
					que.add(truck_weights[i]);
					answer += (que.size() + bridge_length);
					break;
				} else {
					System.out.println("dyrl" + "zzzz");
					que.poll();
					que.add(truck_weights[i]);
					temp = truck_weights[i];
					answer += 1;
				}
			}
		}

		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		ProgrammersL2Truck oneTwoFour = new ProgrammersL2Truck();
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = { 7, 4, 5, 6 };
		System.out.println(oneTwoFour.solution(bridge_length, weight, truck_weights));
	}
}
