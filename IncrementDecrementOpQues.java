public class IncrementDecrementOpQues{
	static public void main(String s[]){
		int a=10,b;
		//b=++a-a;
		//b=++a-a+a++;
		//b=a--+a++-a+a++;
		//b=--a+a++-a--+a;
		//b=a++-++a+a--+a--+--a;
		//b=++a*a--+a--*--a;
		//b=--a+a++-a;
		//b=a++-++a-a--;
		//b=--a*a++/++a-a++-a--;
		b=--a*a++/a--%a--+--a*a;
		System.out.println(a);
		System.out.println(b);
	}
}
  