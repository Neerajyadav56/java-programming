public class ConditionalOperatorEx {

	public static void main(String[] args) {
		int a=10,b=5;
		int c=a++<b--?a++*++b/a:--b%a++-++b/b--;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}