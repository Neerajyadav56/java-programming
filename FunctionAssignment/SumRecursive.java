import java.util.Scanner;

public class SumRecursive {

    static int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Sum = " + sum(n));

        sc.close();
    }
}