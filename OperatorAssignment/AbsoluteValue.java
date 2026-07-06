public class AbsoluteValue {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		int abs = (n < 0) ? -n : n;

		System.out.println("Absolute Value: " + abs);

		sc.close();
	}
}
