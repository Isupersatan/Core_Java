//In multilevel inheritance one class will parent and child at the same time.
package oops.inheritence;

class Animal{
	public void eat() {
		System.out.println("Animal-Eat");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("Dog-Bark");
	}
}

class Puppy extends Dog{
	public void weep() {
		System.out.println("Puppy-weeping");
	}
}

public class MultiLevel {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
		//d.weep();(CTE)
		Puppy p = new Puppy();
		p.eat();
		p.bark();
		p.weep();
	}
}
