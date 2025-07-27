//In a class, creating multiple constructor with 
//different formal argument is called Constructor overloading
package oops.constructor;

class A{
	public A() {
		System.out.println("A()-Cons");
	}
	
	public A(int i) {
		System.out.println("A(int i)-Cons"+i);
	}
	
	public A(int i,int j) {
		System.out.println("A(int i,int j)-Cons"+i+","+j);
	}
}


public class ConsOverloading {
	public static void main(String[] args) {
		new A();
		new A(10);
		new A(10,20);
	}
//Using constructor overloading we can initialize objects in different ways
}
