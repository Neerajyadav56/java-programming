public class FractionSeries {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter N:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (i < n) {
				System.out.print(i + "/" + (i + 1) + " + ");
			} else {
				System.out.print(i + "/" + (i + 1));
			}
		}

		sc.close();
	}
}