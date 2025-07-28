//One super class having multiple sub classes is known as Hierarchical Inheritance. 
package oops.inheritence;
class Animal1{
	public void eat() {
		System.out.println("Eating...");
	}
}
class Dog1 extends Animal1{
	public void bark() {
		System.out.println("Barking..");
	}
}
class Cat1 extends Animal1{
	public void meow() {
		System.out.println("Meow..Meow..");
	}
}

public class HiraricalInheritence {
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.bark();
		d.eat();//inherited
		
		Cat1 c = new Cat1();
		c.meow();
		c.eat();//inherited
	}
}
