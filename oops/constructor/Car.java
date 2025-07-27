//create class and object with different no.
package oops.constructor;

public class Car {
	String name;
	String col;
	int carNum;
	static int regNo=1000;
	
	public Car(String name , String col) {
		this.name=name;
		this.col=col;
		carNum=regNo++;
	}
	
	void display() {
		System.out.println("Car name:"+name);
		System.out.println("Car color:"+col);
		System.out.println("CarNum:"+carNum);
	}
	
	public static void main(String[] args) {
		
		Car c1 = new Car("BMW","White");
		Car c2 = new Car("Marcedes","Black");
		Car c3 = new Car("Ferrari","Red");
		
		c1.display();
		c2.display();
		c3.display();
	}
}
