package dsa.graph;

public class UserProgram {
	
	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		b.add();
		
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
