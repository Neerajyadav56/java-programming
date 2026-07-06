public class Tribonacci {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter terms:");
		int n = sc.nextInt();

		int a = 0;
		int b = 1;
		int c = 1;

		for (int i = 1; i <= n; i++) {

			if (i == 1) {
				System.out.print(a + " ");
			} else if (i == 2) {
				System.out.print(b + " ");
			} else if (i == 3) {
				System.out.print(c + " ");
			} else {
				int d = a + b + c;
				System.out.print(d + " ");

				a = b;
				b = c;
				c = d;
			}
		}

		sc.close();
	}
}