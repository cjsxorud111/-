package problem_solving;


class CodingTestSolution2 {
	public static int solution(int[] A) {
		
		int b = 0;
		
		for (int i1 = 0; i1 < A.length; i1++) {
			int a = i1;
			int c = 0;
			
			for (int i = 0; i < A.length; i++) {

				for (int j = 0; j < A.length; j++) {

					if (A[a] == j) {
						a = A[a];
						c++;
						
						if (a == i1) {
							break;
						}
					}				
				}
				if (a == i1) {
					break;
					
				}

			}
			
		    if(b < c) {
		    	b = c;
		    	
		    }
		
		}
		return b;
	}

	public static void main(String[] args) {
		int[] number = {2, 1 ,0 };

		System.out.println(solution(number));
	}
}