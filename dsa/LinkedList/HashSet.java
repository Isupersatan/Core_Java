package dsa.LinkedList;

public class HashSet {
	Node[] a = new Node[6];
	int count = 0;
	
	public boolean add(Object ele) {
		Node n = new Node(ele);
		int indx = Math.abs(ele.hashCode()%a.length);//Hashing to find the index
		//add node if the index is empty
		if(a[indx] == null) {
			a[indx] = n;
			count++;
			return true;
		}
		
		Node curr = a[indx];
		Node temp = null;
		while(curr != null) {
			if(curr.ele.equals(ele)) return false;
			temp=curr;
			curr = curr.next;
		}
		temp.next=n;
		count++;
		return true;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
	public void display() {
		for(int i=0;i<a.length;i++) {
			Node curr = a[i];
			while(curr != null) {
				System.out.println(curr.ele);
				curr = curr.next;
			}
		}
	}
	
	public boolean contains(Object ele) {
		int indx = Math.abs(ele.hashCode()%a.length);//Hashing to find the index
		Node curr = a[indx];
		while(curr!=null) {
			if(curr.ele.equals(ele))	return true;
			curr=curr.next;
		}
		return false;
	}
	
	public boolean remove(Object ele) {
		int indx = Math.abs(ele.hashCode()%a.length);//Hashing to find the index
		Node curr = a[indx];
		Node prev = null;
		while(curr!=null) {
			if(curr.ele.equals(ele)) {
				
				if(prev==null) {
					a[indx]=a[indx].next;
					count--;
					return true;
				}
				
				prev.next = prev.next.next;
				count--;
				return true;
			}
			prev=curr;
			curr=curr.next;
		}
		return false;
	}
}
