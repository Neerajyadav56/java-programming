public class LCM {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int max;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		while (true) {

			if (max % a == 0 && max % b == 0) {
				System.out.println("LCM = " + max);
				break;
			}

			max++;
		}

		sc.close();
	}
}