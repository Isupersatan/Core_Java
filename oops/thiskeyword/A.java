//This is a keyword which is used to refer 
//non-static data members by using current instance.
package oops.thiskeyword;

public class A {
	//we can't use this keyword inside static context.
	int i,j;
	//This keyword is mandatory to used 
	//when local variable and non-static variables are same. 
	public void add(int i,int j) {
		this.i=i;
		this.j=j;
	}
	
	public void display() {
		System.out.println(i+" "+j);
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.add(10,20);
		a.display();
	}
	

}
