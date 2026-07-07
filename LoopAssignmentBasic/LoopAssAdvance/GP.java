public class GP {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter first term:");
		int a = sc.nextInt();

		System.out.println("Enter common ratio:");
		int r = sc.nextInt();

		int term = a;

		for (int i = 1; i <= 10; i++) {
			System.out.print(term + " ");
			term *= r;
		}

		sc.close();
	}
}