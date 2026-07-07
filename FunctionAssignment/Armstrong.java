import java.util.Scanner;

public class Armstrong {

    static boolean isArmstrong(int n) {

        int sum = 0;
        int temp = n;

        while (temp != 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isArmstrong(n))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");

        sc.close();
    }
}