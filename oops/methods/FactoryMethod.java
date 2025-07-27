//If any method is creating object and return instance 
//those methods are called as Factory Method
package oops.methods;

import java.util.Scanner;

class Book{
	String name;
	double price;
	String author;
	
	public void display() {
		System.out.println("Book name:"+name);
		System.out.println("Book price:"+price);
		System.out.println("Book author:"+author);
	}
	
	public static Book getBook() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Book Details: ");
		Book b = new Book();
		
		b.name=sc.nextLine();
		b.price=sc.nextDouble();
		b.author=sc.next();
		
		sc.close();
		
		return b;
	}
}


public class FactoryMethod {
	
	public static void main(String[] args) {
		Book b1 = Book.getBook();
		b1.display();
	}
}
