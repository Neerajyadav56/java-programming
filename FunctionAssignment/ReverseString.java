public class ReverseString {
	static String reverse(String str) {

		if (str.length() == 0)
			return "";

		return reverse(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		String str = sc.nextLine();

		System.out.println(reverse(str));

		sc.close();
	}
}