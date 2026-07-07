public class Armstrong {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		int temp = n;
		int sum = 0;

		while (temp > 0) {
			int digit = temp % 10;
			sum += digit * digit * digit;
			temp /= 10;
		}

		if (sum == n) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}

		sc.close();
	}
}