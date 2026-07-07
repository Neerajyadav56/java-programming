public class ReverseNumber {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		int rev = 0;

		while (n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n /= 10;
		}

		System.out.println("Reverse = " + rev);

		sc.close();
	}
}
