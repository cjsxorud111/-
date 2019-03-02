package problem_solving;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Map.Entry;

public class Dfs_bfs {
	static int a, b, v;
	static int[][] c;
	static boolean[] cc;

	static void dfsr(int FirstNode) {
		
		System.out.print(FirstNode+" ");
		cc[FirstNode] = true;
		for (int i = 1; i <= a; i++) {
			if(c[FirstNode][i] == 1) {
				if (cc[i] == false) {
					
					dfsr(i);
				}
			}
		}
	}

	static void bfs(int FirstNode) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(FirstNode);
		cc[FirstNode] = true;
		System.out.print(q.poll() + " ");
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {

				if (c[FirstNode][j] == 1) {
					if (cc[j] == false) {
						q.offer(j);
						cc[j] = true;
					}
				}
			}
			
			if (!q.isEmpty()) {
				FirstNode = q.poll();
				System.out.print(FirstNode + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		v = sc.nextInt();
		c = new int[1001][1001];
		cc= new boolean[10001];
		for (int i = 0; i < b; i++) {
			int d, e;
			d = sc.nextInt();
			e = sc.nextInt();

			c[d][e] = 1;
			c[e][d] = 1;
		}

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println(" ");
		}

		dfsr(v);
		System.out.println(" ");
		for (int i = 0; i <= a; i++) {
			cc[i] = false;
		}
		bfs(v);
		
	}
}
