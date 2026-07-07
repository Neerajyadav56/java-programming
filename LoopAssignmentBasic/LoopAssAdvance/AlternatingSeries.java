public class AlternatingSeries {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter N:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				System.out.print(-i + " ");
			} else {
				System.out.print(i + " ");
			}
		}

		sc.close();
	}
}