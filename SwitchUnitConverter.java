import java.util.Scanner;

public class SwitchUnitConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Kilometer to Meter");
        System.out.println("2. Meter to Centimeter");
        System.out.println("3. Centimeter to Millimeter");
        System.out.println("4. Meter to Kilometer");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter Kilometer: ");
                double km = sc.nextDouble();
                System.out.println("Meter = " + (km * 1000));
                break;

            case 2:
                System.out.print("Enter Meter: ");
                double m = sc.nextDouble();
                System.out.println("Centimeter = " + (m * 100));
                break;

            case 3:
                System.out.print("Enter Centimeter: ");
                double cm = sc.nextDouble();
                System.out.println("Millimeter = " + (cm * 10));
                break;

            case 4:
                System.out.print("Enter Meter: ");
                double meter = sc.nextDouble();
                System.out.println("Kilometer = " + (meter / 1000));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}