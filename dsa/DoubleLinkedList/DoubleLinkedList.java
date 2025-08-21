package dsa.DoubleLinkedList;

public class DoubleLinkedList {
	Node head;
	int count = 0;
	
	public void add(Object ele) {
		Node n = new Node(ele);
		if(head==null) {
			head = n;
			count++;
			return;
		}
		Node curr = head;
		while(curr.next!=null) 
			curr = curr.next;
			curr.next = n;
			n.prev = curr;
			count++;
		
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return count==0;
	}	
	
	public void display() {
		Node curr = head;
		while(curr!=null) {
			System.out.println(curr.ele);
			curr = curr.next;
		}
	}
	
	public void addFirst(Object ele) {
		Node n = new Node(ele);
		n.next = head;
		head.prev = n;
		head = n;
		count++;
	}
	
	public void add(Object ele,int indx) {
		if(indx<0 || indx>=size())	throw new IndexOutOfBoundsException();
		Node n = new Node(ele);
		if(indx==0) {
			addFirst(ele);
			return;
		}
		
		Node curr = head;
		for(int i=1;i<indx;i++) {
			curr=curr.next;
		}
		
		n.next = curr.next;
		n.prev = curr;
		curr.next.prev = n;
		curr.next = n;
		count++;
	}
	
	public void removeFirst() {
		head=head.next;
		head.prev=null;
		count--;
	}
	
	public void remove(int indx) {
		if(indx<0 || indx>=size())	throw new IndexOutOfBoundsException();
		
		if(indx==0) {
			removeFirst();
			return;
		}
	
		Node curr = head;
		for(int i=1;i<indx;i++)	curr=curr.next;
		if(curr.next.next==null) {
			curr.next=null;
			return;
		}
		curr.next = curr.next.next;
		curr.next.prev=curr;
		count--;
	}
}
