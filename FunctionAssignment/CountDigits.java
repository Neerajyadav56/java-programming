public class CountDigits {
	static int countDigits(int n) {

		int count = 0;

		while (n > 0) {
			count++;
			n /= 10;
		}

		return count;
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int n = sc.nextInt();

		System.out.println("Digits = " + countDigits(n));

		sc.close();
	}
}