public class Circumference {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		float PI = 3.14f;
		System.out.println("Enter radius:");
		int r=sc.nextInt();
		float c= (2 * PI * r);
		System.out.println("Cicumference of circle: "+c);
		sc.close();
	}
}