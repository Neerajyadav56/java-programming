public class SquareSeries {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter terms:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print(i * i + " ");
		}

		sc.close();
	}
}