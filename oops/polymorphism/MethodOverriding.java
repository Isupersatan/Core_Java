//The process of changing and providing implementation for super class 
//non static method in sub class is known as Method Overriding.
package oops.polymorphism;

class A{
	public void m1() {
		System.out.println("m1()-A");
	}
}
//To achieve overriding IS-A relationship is mandatory
class B extends A{
	//while overriding access modifiers can be same or wider
	public void m1() {//while overriding method return type can be same
		System.out.println("m1()-B");					//or co-varient return type.
		//in method overriding sub class should have method signature 
		//same as super class method. 
	}
}
// in java we can override any non-static , non-private , non-final method.
//we can not override static , private,final method.
public class MethodOverriding {
	public static void main(String[] args) {
		B b = new B();
		b.m1();
	}
}
