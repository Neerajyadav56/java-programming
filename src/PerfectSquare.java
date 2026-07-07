import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int root = (int) Math.sqrt(num);

        if (root * root == num)
            System.out.println(num + " is a Perfect Square");
        else
            System.out.println(num + " is Not a Perfect Square");

        sc.close();
    }
}