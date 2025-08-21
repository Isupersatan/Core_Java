package dsa.LinkedList;

public class LinkedList {
	Node head;
	int count=0;
	
	public void add(Object ele) {
		if(head==null) {
			head = new Node(ele);
			count++;
			return;
		}
		Node curr = head;
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next=new Node(ele);
		count++;
	}
	
	public int size() {
		return count ;
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
	public void display() {
		Node curr = head;
		while(curr!=null) {
			System.out.println(curr.ele);
			curr=curr.next;
		}
	}
	
	public Object get(int indx) {
		if(indx<0 || indx>=size())	throw new IndexOutOfBoundsException();
		
		if(indx==0)	return head.ele;
		Node curr= head;
		for(int i=1;i<=indx;i++) 
			curr=curr.next;
		
			return curr.ele;
	}
	
	public void addFirst(Object ele) {
		Node n = new Node(ele);
		n.next=head;
		head=n;
		count++;
	}
	
	public void add(Object ele,int indx) {
		if(indx<0 || indx>=size())	throw new IndexOutOfBoundsException();
		if(indx==0)	{
			addFirst(ele);
			return;
		}
		Node n = new Node(ele);
		Node curr = head;
		for(int i=1;i<indx;i++)	curr = curr.next;
		n.next=curr.next;
		curr.next=n;
		count++;
			
	}
	
	public void removeFirst() {
		head=head.next;
		count--;
	}
	
	public void remove(int indx) {
		if(indx<0 || indx>=size())	throw new IndexOutOfBoundsException();
		if(indx==0)	{
			removeFirst();
			return;
		}
		Node curr = head;
		for(int i=1;i<indx;i++)	curr = curr.next;
		curr.next = curr.next.next;
		count--;
	}
	
}
