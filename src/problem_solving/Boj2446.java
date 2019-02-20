package problem_solving;

import java.util.Scanner;

public class Boj2446 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N >= 1 && N <= 100) {

			int n = 1;

			for (int i = 1; i < N; i++) {
				for (int j = 0; j < i-1; j++) {
					System.out.print(" ");
				}
				for (int j = N + (N - 1); j >= n; j--) {

					System.out.print("*");
				}
				n = n + 2;
				System.out.println("");
			}

			for (int i = 1; i <= N; i++) {
				for (int j2 = N; j2 > i; j2--) {

					System.out.print(" ");
				}
				for (int j = 0; j < i + (i - 1); j++) {

					System.out.print("*");

				}
				System.out.println("");
			}

		}
	}

}
