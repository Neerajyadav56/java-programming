public class MaxThree {
	static int max3(int a, int b, int c) {
		if (a > b && a > c)
			return a;
		else if (b > c)
			return b;
		else
			return c;
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println("Max = " + max3(a, b, c));

		sc.close();
	}
}