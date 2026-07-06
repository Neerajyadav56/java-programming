public class Fibonacci {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter terms:");
		int n = sc.nextInt();

		int a = 0;
		int b = 1;

		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");

			int c = a + b;
			a = b;
			b = c;
		}

		sc.close();
	}
}