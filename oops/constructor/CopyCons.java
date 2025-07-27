//Copy constructor is used to copy the values
//from one object to another object
package oops.constructor;

class Student{
	
	String name; 
	int age, id;
	
	public Student(String name,int age,int id){
		this.name=name;
		this.age=age;
		this.id=id;
	}
	
	public Student(Student s){
		this.name=s.name;
		this.age=s.age;
		this.id=s.id;
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
		System.out.println("Id: "+id);
	}
}

public class CopyCons {
	
	public static void main(String[] args) {
		Student s1 = new Student("Ram", 16, 101);
		Student s2 = new Student(s1);
		s1.display();
		s2.display();
		
	}
}
