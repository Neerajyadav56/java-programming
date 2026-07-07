public class LeapYears {
	public static void main(String[] args) {

		for (int year = 1900; year <= 2100; year++) {

			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.print(year + " ");
			}
		}

	}
}
