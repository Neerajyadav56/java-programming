public class Median {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter a:");
		int a = sc.nextInt();

		System.out.println("Enter b:");
		int b = sc.nextInt();

		System.out.println("Enter c:");
		int c = sc.nextInt();

		int median = (a > b)
				? ((a < c) ? a : ((b > c) ? b : c))
				: ((b < c) ? b : ((a > c) ? a : c));

		System.out.println("Median: " + median);

		sc.close();
	}
}