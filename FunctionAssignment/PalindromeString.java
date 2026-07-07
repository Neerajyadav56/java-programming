public class PalindromeString {
	static boolean isPalindrome(String str) {

		if (str.length() <= 1)
			return true;

		if (str.charAt(0) != str.charAt(str.length() - 1))
			return false;

		return isPalindrome(str.substring(1, str.length() - 1));
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		String str = sc.nextLine();

		System.out.println(isPalindrome(str));

		sc.close();
	}
}