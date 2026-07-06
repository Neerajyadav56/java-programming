public class PowerOfTwo {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		System.out.println((n > 0 && (n & (n - 1)) == 0) ? "Power of Two" : "Not Power of Two");

		sc.close();
	}
}