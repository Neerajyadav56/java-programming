public class IsEven {
	static boolean isEven(int n) {
		return n % 2 == 0;
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(isEven(n));

		sc.close();
	}
}