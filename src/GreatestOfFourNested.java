import java.util.Scanner;

public class GreatestOfFourNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        int greatest;

        if (a > b) {
            if (a > c) {
                if (a > d)
                    greatest = a;
                else
                    greatest = d;
            } else {
                if (c > d)
                    greatest = c;
                else
                    greatest = d;
            }
        } else {
            if (b > c) {
                if (b > d)
                    greatest = b;
                else
                    greatest = d;
            } else {
                if (c > d)
                    greatest = c;
                else
                    greatest = d;
            }
        }

        System.out.println("Greatest Number = " + greatest);

        sc.close();
    }
}