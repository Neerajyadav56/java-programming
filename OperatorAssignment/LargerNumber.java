public class LargerNumber {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter first number:");
		int a = sc.nextInt();

		System.out.println("Enter second number:");
		int b = sc.nextInt();

		int max = (a > b) ? a : b;

		System.out.println("Larger Number: " + max);

		sc.close();
	}
}