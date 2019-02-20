package problem_solving;

import java.util.Scanner;

public class Baekjoon2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}

		int a = 0, b = 0;
		
		for (int i = 0; i < arr.length; i++) {

			int result = 0;

			for (int j = 0; j < arr.length; j++) {

				for (int j2 = 0; j2 < arr.length; j2++) {

					if (j2 == i) {
						
					}else if(j2 == j){
						
					}else {
					}
						result = result + arr[j];
						System.out.println(i+"dd "+j);
					}
				
				if (result == 100) {
					a = i;
					b = j;
					System.out.println(a+"dd "+b);
				}

				}
				
				
		
			}
		}

		for (int i = 0; i < 9; i++) {
			if (i != a || i != b) {
				System.out.println(arr[i]);
			}*/
			
		}

	}

}
