public class SumMethod {
	static int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Sum = " + sum(a, b));

		sc.close();
	}
}
