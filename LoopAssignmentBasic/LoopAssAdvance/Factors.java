public class Factors {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		System.out.print("Factors: ");

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}

		sc.close();
	}
}