package dsa.Bst;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinarySerachTree {
	Node root;
	int count = 0;
	boolean flag = true;
	//single argument for add method for user 
	public boolean add(int key) {
		root = add(root,key);
		return flag;
	}
	
	//overloaded two argument add method
	public Node add(Node n,int key) {
		if(n==null) {
			n = new Node(key);
			count++;
			return n;
		}
		
		if(key < n.key)	n.left=add(n.left,key);
		else if(key > n.key)	n.right=add(n.right,key);
		else	flag=false;
		
		return n;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return count==0;
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
	
	public boolean contains(int key) {
		return contains(root,key);
	}
	
	public boolean contains(Node n,int key) {
		if(n==null)	return false;
		if(n.key==key)	return true;
		if(key<n.key)	return contains(n.left, key);
		return contains(n.right,key);
	}
	
	public void remove(int key) {
		root = remove(root,key);
	}
	
	public Node remove(Node n,int key) {
		if(n==null)	return null;
		if(key<n.key)	n.left=remove(n.left,key);
		else if(key>n.key)	n.right=remove(n.right,key);
		else {
			if(n.left==null) {
				count--;
				return n.right;
			}
			else if(n.right==null) {
				count--;
				return n.left;
			}
			else {
				n.key = minEle(n.right);
				n.right = remove(n.right,n.key);
			}
		}
		return n;
	}
	
	public int minEle(Node n) {
		int min = n.key;
		while(n.left!=null) {
			min = n.left.key;
			n=n.left;
		}
		return min;
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
}
