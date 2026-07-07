public class SumDigits {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		int sum = 0;

		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}

		System.out.println("Sum = " + sum);

		sc.close();
	}
}
