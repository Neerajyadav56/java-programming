public class CountDigits {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		int count = 0;

		if (n == 0) {
			count = 1;
		}

		while (n > 0) {
			n /= 10;
			count++;
		}

		System.out.println("Digits = " + count);

		sc.close();
	}
}