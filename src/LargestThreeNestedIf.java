import java.util.Scanner;

public class LargestThreeNestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c)
                System.out.println("Largest Number = " + a);
            else
                System.out.println("Largest Number = " + c);
        } else {
            if (b > c)
                System.out.println("Largest Number = " + b);
            else
                System.out.println("Largest Number = " + c);
        }

        sc.close();
    }
}