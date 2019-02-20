package reference;

public class DinamicProgramming {

	static int[] d = new int[100];

	static int dp(int a) {
		if (a == 1)
			return 1;
		if (a == 2)
			return 1;
		if (d[a] != 0)
			return d[a];
		
		return d[a] = dp(a - 1) + dp(a - 2);
		/* return dp(a - 1) + dp(a - 2); */
	}

	public static void main(String[] args) {

		System.out.println(dp(47));

	}

}
