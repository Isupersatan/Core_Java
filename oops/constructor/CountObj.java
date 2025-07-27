//check how many object is created
package oops.constructor;

class Phone{
	static int count = 0;
	public Phone() {
		count++;
	}
	
}
public class CountObj {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		System.out.println(Phone.count);
		
	}
}
