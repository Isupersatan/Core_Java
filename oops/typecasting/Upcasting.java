//The process of creating object of sub class and assigning reference
//into super type reference variable is called as Upcasting.
package oops.typecasting;
class A{
	int i =10;
	public void m1() {
		System.out.println("M1()-A");
	}
}
//To achieve upcasting IS-A relationship is mandatory
class B extends A{
	int j = 20;
	public void m2() {
		System.out.println("M2()-B");
	}
}
class C extends B{
	int k = 30;
	public void m3() {
		System.out.println("M3()-C");
	}
}
 class Upcasting {
	public static void main(String[] args) {
		//it is implicit type casting, also known auto type casting 
		A a = new B();
		System.out.println(a.i);
		a.m1();
		//By using upcasting reference variable we can't access sub class properties 
//		System.out.println(a.j); CTE
//		a.m2();	CTE
		
		B b = new C();
		System.out.println(b.i);//inherited
		b.m1();//inherited methods
		
		System.out.println(b.j);
		b.m2();
	}
}
