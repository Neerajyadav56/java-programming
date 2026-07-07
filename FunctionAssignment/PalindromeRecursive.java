import java.util.Scanner;

public class PalindromeRecursive {

    static boolean palindrome(String str) {

        if (str.length() <= 1)
            return true;

        if (str.charAt(0) != str.charAt(str.length() - 1))
            return false;

        return palindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (palindrome(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}