public class EvenOddDigits {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		int even = 0;
		int odd = 0;

		while (n > 0) {
			int digit = n % 10;

			if (digit % 2 == 0) {
				even++;
			} else {
				odd++;
			}

			n /= 10;
		}

		System.out.println("Even Digits = " + even);
		System.out.println("Odd Digits = " + odd);

		sc.close();
	}
}