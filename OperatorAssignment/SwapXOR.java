public class SwapXOR {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter first number:");
		int a = sc.nextInt();

		System.out.println("Enter second number:");
		int b = sc.nextInt();

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		sc.close();
	}
}