import java.util.Scanner;

public class Square {

    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Square = " + square(n));

        sc.close();
    }
}