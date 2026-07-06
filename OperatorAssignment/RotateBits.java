public class RotateBits {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		System.out.println("Enter positions:");
		int d = sc.nextInt();

		int left = (n << d) | (n >>> (32 - d));
		int right = (n >>> d) | (n << (32 - d));

		System.out.println("Left Rotate: " + left);
		System.out.println("Right Rotate: " + right);

		sc.close();
	}
}