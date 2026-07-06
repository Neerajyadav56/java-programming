public class Factorial {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		long fact = 1;

		for (int i = 1; i <= n; i++) {
			fact *= i;
		}

		System.out.println("Factorial = " + fact);

		sc.close();
	}
}