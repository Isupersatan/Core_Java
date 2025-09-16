package dsa.Bst;

public class UserProgram {
	public static void main(String[] args) {
		BinarySerachTree b = new BinarySerachTree();
		b.add(50);
		b.add(70);
		b.add(30);
		b.add(10);
		b.add(40);
		b.add(60);
		b.add(90);
		
		b.preOrder();
		System.out.println();
		b.postOrder();
		System.out.println();
		b.inOrder();
		System.out.println();
		b.levelOrder();
		System.out.println();
		
		b.display();
	}
}
