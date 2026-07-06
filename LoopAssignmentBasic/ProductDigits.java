public class ProductDigits {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		int product = 1;

		while (n > 0) {
			product *= n % 10;
			n /= 10;
		}

		System.out.println("Product = " + product);

		sc.close();
	}
}