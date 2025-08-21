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
		}
	}
}
