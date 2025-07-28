//The process of acquiring properties from super class to another class
//is called as inheritence.
package oops.inheritence;
//The inheritence between one parent and one child is called as Single level inheritence.
//Super class is a class from which sub class inherit the properties.
class A{
	int i=10,j=20;
	public void m1() {
		System.out.println("m1()-A");
	}
}
//We can achieve IS-A relationship using extends keyword
//sub class is a class which inherits another class.
class B extends A{
	int k = 30;
	public void m2(){
		System.out.println(i+","+j+","+k);
	}
}

public class SingleInheritence {
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		//a.m2();/By using super class reference we can not access sub class properties.
		B b = new B();
		b.m1();//by using sub class reference we can access super class properties.
		b.m2();
	}
}
