import java.util.Scanner;

public class PointPosition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0)
            System.out.println("Point is at Origin");
        else if (x == 0)
            System.out.println("Point lies on Y-Axis");
        else if (y == 0)
            System.out.println("Point lies on X-Axis");
        else
            System.out.println("Point lies on Neither Axis");

        sc.close();
    }
}