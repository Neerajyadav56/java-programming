public class ToggleBit {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		System.out.println("Enter bit position:");
		int pos = sc.nextInt();

		int result = n ^ (1 << (pos - 1));

		System.out.println("Result: " + result);

		sc.close();
	}
}