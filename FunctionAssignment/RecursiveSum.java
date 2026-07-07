public class RecursiveSum {
	static int sum(int n) {
		if (n == 1)
			return 1;

		return n + sum(n - 1);
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(sum(n));

		sc.close();
	}
}