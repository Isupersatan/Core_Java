package dsa.LinkedList;

public class Stack {
	Node head;
	int count = 0;
	
	public void push(Object ele) {
		Node n = new Node(ele);
		if(head==null) {
			head = n;
			count++;
			return;
		}
		n.next = head;
		head=n;
		count++;
	}
	
	public Object peek() {
		return head.ele;
	}
	
	public Object pop() {
		Object ele = head.ele;
		head = head.next;
		count--;
		return ele;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return count==0;
	}
}
