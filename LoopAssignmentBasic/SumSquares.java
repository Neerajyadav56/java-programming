public class SumSquares {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter N:");
		int n = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i * i;
		}

		System.out.println("Sum = " + sum);

		sc.close();
	}
}	