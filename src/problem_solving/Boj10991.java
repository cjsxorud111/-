package problem_solving;

import java.util.Scanner;

public class Boj10991 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N >= 1 && N <= 100) {

			for (int i = 1; i <= N; i++) {
				for (int j2 = N; j2 > i; j2--) {

					System.out.print(" ");
				}
				for (int j = 0; j < i + (i - 1); j++) {

					if (i != N) {

						if (j == 0 || j == i + (i - 1) - 1) {
							System.out.print("*");
						} else if (j > 0 && j < i + (i - 1) - 1) {
							System.out.print(" ");
						}

					} else {
						System.out.print("*");
					}
				}
				System.out.println("");
			}
		}
	}

}
