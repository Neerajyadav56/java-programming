public class FloydTriangle {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter rows:");
		int n = sc.nextInt();

		int num = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}

			System.out.println();
		}

		sc.close();
	}
}