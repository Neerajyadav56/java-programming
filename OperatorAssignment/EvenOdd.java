public class EvenOdd {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		System.out.println((n % 2 == 0) ? "Even" : "Odd");

		sc.close();
	}
}