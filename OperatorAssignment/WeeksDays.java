public class WeeksDays {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter total days:");
		int days = sc.nextInt();

		int weeks = days / 7;
		int rem = days % 7;

		System.out.println("Weeks: " + weeks);
		System.out.println("Remaining Days: " + rem);

		sc.close();
	}

}
