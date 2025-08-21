package dsa.ArrayLIst;

public class Queue {
	Object[] a = new Object[10];
	int count= 0;
	
	//add method to add a element
	public void add(Object ele) {
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
	
	public Object peek() {
		return a[0];
	}
	
	public Object poll() {
		Object o = a[0];
		for(int i=0;i<count;i++) {
			a[i]=a[i+1];
		}
		count--;
		return o;
	}
}
