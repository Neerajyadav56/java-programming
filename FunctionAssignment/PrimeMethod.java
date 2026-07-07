public class PrimeMethod {
	static boolean isPrime(int n) {

		if (n < 2)
			return false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(isPrime(n));

		sc.close();
	}
}