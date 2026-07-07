public class Palindrome {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		int temp = n;
		int rev = 0;

		while (temp > 0) {
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp /= 10;
		}

		if (n == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

		sc.close();
	}
}