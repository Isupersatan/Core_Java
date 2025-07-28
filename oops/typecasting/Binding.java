//The process of connecting a method to its implementation is called as binding.
package oops.typecasting;

class A1{
	public void m1() {
		System.out.println("m1()-A");
	}
	public static void m2() {
		System.out.println("m2()-A");
	}
}

class B1 extends A1{
	@Override
	public void m1() {
		System.out.println("m1()-B");
	}
	public static void m2() {
		System.out.println("m2()-B");
	}
}

public class Binding {
	public static void main(String[] args) {
		A1 a = new B1();
		a.m1();//late binding
		a.m2();//early binding
	}
}
//in , java there are two types of binding - 1.Early binding 2.early binding