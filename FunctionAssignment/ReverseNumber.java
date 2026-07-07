public class ReverseNumber {
	static int reverse(int n) {

		int rev = 0;

		while (n > 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}

		return rev;
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int n = sc.nextInt();

		System.out.println("Reverse = " + reverse(n));

		sc.close();
	}
}