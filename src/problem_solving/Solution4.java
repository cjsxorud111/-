package problem_solving;

public class Solution4 {
	
	
	
	public int solution(int[][] Board) {
		
		
		for (int i = 0; i < Board.length; i++) {
			
			for (int j = 0; j < Board[i].length; j++) {
				
				if (Board[i][j+1] >= 0) {
					
				} else if(Board[i][j-1] >= 0) {
					
				} else if(Board[i+1][j] >= 0) {
					
				} else if(Board[i-1][j+1] >= 0) {
					
				}	
				
			}
			
		}
		
		return 0;
        
    }
	
	public static void main(String[] args) {
		
		
		int[][] Board = {};
		
		System.out.println();
		

	}
}
