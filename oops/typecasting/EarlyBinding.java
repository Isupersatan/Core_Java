// connecting a method call to its implementation at compile time
//by compiler based on method name and arguments is known as early binding
package oops.typecasting;
class AA{
	static int i=10; int j = 20;
	
	public static void m1() {
		System.out.println("m1()-A");
	}
	
	public final void m2() {
		System.out.println("m2()-A");
	}
	
	public void m3() {
		System.out.println("m3()-A");
	}
}
//all static , final , private methods will be binded at compile time
class BB extends AA{
	static int i=30; int j = 40;
	
	public static void m1() {
		System.out.println("m1()-B");
	}
	@Override
	public void m3() {
		System.out.println("m3()-B");
	}
}
class CC extends BB{
	int i=30; static int j = 40;
	
	@Override
	public final void m3() {
		System.out.println("m3()-C");
	}
}

public class EarlyBinding {
	public static void main(String[] args) {
		BB b = new CC();
		//all data members will be binded at compile time
		System.out.println(b.i+","+b.j);//early
		b.m1();//early
		b.m2();//early
		b.m3();//late
	}
//early binding also known as compile time binding or static binding
//when overloaded method will called, early binding will take places 
}
