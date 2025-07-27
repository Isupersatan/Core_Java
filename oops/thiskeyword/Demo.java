//In java , methods can return objects.
package oops.thiskeyword;

public class Demo {
	
	//if type of method is non-primitive
	public static A create() {
		//that method will return object address
		A a1 = new A();
		//by reference variable of an object
		return a1;
	}
	
	public static void main(String[] args) {
		A a1 = create();
		a1.add(10, 20);// call add() function of A class
		System.out.println(a1.i+" "+a1.j);
	}

}
