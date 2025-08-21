package dsa.ArrayLIst;

public class ArrayList {
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
	
	//get() to get element of specific index
	public Object get(int indx) {
		if(indx<0 || indx>=size())	throw new IndexOutOfBoundsException();
		return a[indx];
	}
	
	//remove() to delete element of a specific index
	public void remove(int indx) {
		if(indx<0 || indx>=size())	throw new IndexOutOfBoundsException();
		for(int i=indx;i<size();i++) {
			a[i]=a[i+1];
		}
		count--;
	}
	
	//overloaded add() method to add element to specific index
	public void add(Object ele,int indx) {
		if(indx<0 || indx>=size())	throw new IndexOutOfBoundsException();
		for(int i=size();i>indx;i++) {
			a[i]=a[i-1];
		}
		a[indx]=ele;
		count++;
	}
	
	//display()- to display all element which stored
	public void display() {
		for(int i=0;i<=size()-1;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
}
