package dsa.LinkedList;

import java.util.NoSuchElementException;

public class Queue {
	Node head;
	int count = 0;
	
	public void add(Object ele) {
		if(head==null) {
			head = new Node(ele);
			count++;
			return;
		}	
		
		Node curr = head;
		while(curr.next!=null) 
			curr = curr.next;
			
			curr.next = new Node(ele);
			count++;
		
	}
	
	public int size() {
		return count;
	}
	
	public Object peek() {
		if(size()==0)	throw new NoSuchElementException();
		return head.ele;
	}
	
	public Object poll() {
		if(size()==0)	throw new NoSuchElementException();
		Object ele = head.ele;
		head = head.next;
		count--;
		return ele;
	}
	
	public boolean isEmpty() {
		return count==0;
	}
}
