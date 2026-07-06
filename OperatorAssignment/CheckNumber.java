public class CheckNumber {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		String result = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";

		System.out.println(result);

		sc.close();
	}
}