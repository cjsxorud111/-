package problem_solving;

public class Cdility1 {
	
	static int ss(int A) {
		
		return A;
	}
	
	static int solution(int A) {
		
		String B = Integer.toBinaryString (A);
		
		String []result = B.split("");
		int count = 0;
		int count1 = 0;
		
		for (int i = 0; i < result.length; i++) {
			
			if(result[i].equals("0")) {
				count++;
				
			}else {
				if(count1 < count) {
					count1 = count;
					count = 0;
				}
			}
			
		}
		return ss(count1);
		
	}
	
	public static void main(String[] args) {
		System.out.println(solution(32));
	}

}
