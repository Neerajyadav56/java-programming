public class MaxTwo {
	static int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Max = " + max(a, b));

		sc.close();
	}
}