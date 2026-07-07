public class AP {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter first term:");
		int a = sc.nextInt();

		System.out.println("Enter common difference:");
		int d = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.print((a + i * d) + " ");
		}

		sc.close();
	}
}