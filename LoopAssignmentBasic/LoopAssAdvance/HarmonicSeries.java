public class HarmonicSeries {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter N:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (i < n) {
				System.out.print("1/" + i + " + ");
			} else {
				System.out.print("1/" + i);
			}
		}

		sc.close();
	}
}