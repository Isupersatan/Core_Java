package dsa.ArrayLIst;

public class Stack {
	Object[] a = new Object[10];
	int count= 0;
	
	//add method to add a element
	public void push(Object ele) {
		a[count++]=ele;
		if(count==a.length) increase();
	}
	//increase arraylist size  if arraylist is full 
	public void increase() {
		Object[] b = new Object[a.length+1];
		System.arraycopy(a, 0, b, 0, a.length);
		a=b;
	}
	
	//size() method to get size
	public int size() {
		return count;
	}
	//isEmpty() to check arraylist is empty or not
	public boolean isEmpty() {
		return count==0;
	}
	
	//get() to get element of specific index
	public Object peek() {
		return a[size()-1];
	}
	
	//remove() to delete element of a specific index
	public Object pop() {
		Object o = a[size()-1];
		a[size()-1]=null;
		count--;
		return o;
	}
	
}
