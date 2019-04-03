package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution03 {
	public int solution(String numbers) {
		
		
		
		return 0;
	}
}

public class Programmers2DArray {
	public static void main(String[] args) {
		Solution03 sol = new Solution03();
		int[][] a = new int[3][2];
		
		a[0][0] = 1;a[0][1] = 2;
		a[1][0] = 3;a[1][1] = 4;
		a[2][0] = 5;a[2][1] = 6;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		int[][] b = {{1,2},{3,4},{5,6}};
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}
		
		
	}
}
