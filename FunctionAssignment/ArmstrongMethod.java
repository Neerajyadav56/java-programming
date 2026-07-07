public class ArmstrongMethod {
	static boolean isArmstrong(int n) {

		int temp = n;
		int sum = 0;

		while (temp > 0) {
			int digit = temp % 10;
			sum += digit * digit * digit;
			temp /= 10;
		}

		return sum == n;
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(isArmstrong(n));

		sc.close();
	}
}