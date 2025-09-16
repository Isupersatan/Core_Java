package dsa.graph;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
	Node root;
	int count=0;
	
	public void add() {
		System.out.println("Add root element");
		root = new Node(new Scanner(System.in).nextInt());
		count++;
		add(root);
	}
	
	public void add(Node n) {
		Scanner sc = new Scanner(System.in);
		//adding element at left side
		System.out.println("Do you want to add element at left side of "+n.key);
		boolean left = sc.nextBoolean();
		if(left) {
			n.left = new Node(sc.nextInt());
			count++;
			add(n.left);
		}
		//adding element right side
		System.out.println("Do you want to add element at right side of "+n.key);
		boolean right = sc.nextBoolean();
		if(right) {
			n.right = new Node(sc.nextInt());
			count++;
			add(n.right);
		}
		//sc.close();
	}
	
	public int size() {
		return count;
	}
	public void display() {
		display(root,0);
	}
	
	public void display(Node n,int level) {
		if(n==null)	return;
		
		display(n.right,level+1);
		
		if(level!=0) {
			for(int i=0;i<level-1;i++) 
				System.out.print("|\t");
				
			System.out.println("------>"+n.key);
		}
		else	
			System.out.println(n.key);
		
		display(n.left, level+1);
	}
	
	//Depth First Search(PreOrder,PostOrder,InOrder)
		//Pre-Order Traverse(root,left,right)
		public void preOrder() {
			preOrder(root);
		}
		
		public void preOrder(Node n) {
			if(n==null)	return;
			System.out.print(n.key+" ");
			preOrder(n.left);
			preOrder(n.right);
		}
		
		//Post Order Traverse(left,right,root)
		public void postOrder() {
			postOrder(root);
		}
		
		public void postOrder(Node n) {
			if(n==null)	return;
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.key+" ");
		}
		
		//In-Order Traverse(left,root,right)
		public void inOrder() {
			inOrder(root);
		}
		
		public void inOrder(Node n) {
			if(n==null)	 return;
			inOrder(n.left);
			System.out.print(n.key+" ");
			inOrder(n.right);
		}
		
		//Breadth First Search - level Order
		public void levelOrder() {
			Queue <Node> q = new ArrayDeque<Node>();
			q.add(root);
			while(!q.isEmpty()) {
				Node n = q.poll();
				System.out.print(n.key+" ");
				if(n.left!=null)	q.add(n.left);
				if(n.right!=null)	q.add(n.right);
			}
		}

}
