//Constructor is special type of non-static method
//which is used to initialize non-static data members of a class
package oops.constructor;
//we can create constructor with formal parameter
// or without formal parameter
public class Test {
	//Constructor name should be same name as class name
	//Constructor doesn't have any return type
	Test() {
		//creating constructor without formal parameter
		//is known as no-argument constructor(Default Constructor)
		System.out.println("Test()-Cons");
	}
	
	public static void main(String[] args) {
		//Constructor will get executed when ever 
		//object is created using new keyword
		Test t = new Test();
		
		Mobile m = new Mobile("IQoo3","Lava Orange",12,128);
		m.display();
	}
}

class Mobile{
	String name,color;
	int ram,rom;
	
	public Mobile(String name,String color,int ram,int rom){
		//creating constructor with formal parameter is known as parameterized constructor
		this.name=name;
		this.ram=ram;
		this.rom=rom;
		this.color=color;
	}
	
	public void display() {
		System.out.println("Mobile name:"+name);
		System.out.println("Mobile ram:"+ram);
		System.out.println("Mobile rom:"+rom);
		System.out.println("Mobile color:"+color);
	}
}
