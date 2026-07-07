public class Square {
	static int square(int n) {
		return n * n;
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int n = sc.nextInt();

		System.out.println("Square = " + square(n));

		sc.close();
	}
}
