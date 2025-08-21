package dsa.DoubleLinkedList;

public class UserProgram {
	public static void main(String[] args) {
		DoubleLinkedList dl = new DoubleLinkedList();
		dl.add(10);
		dl.add(20);
		dl.add(30);
		dl.add(40);
//		
//		dl.addFirst(5);
//		dl.add(15, 2);
//		dl.removeFirst();
		dl.remove(3);
		dl.display();
	}
}
