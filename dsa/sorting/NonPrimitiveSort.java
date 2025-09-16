package dsa.sorting;

import java.util.Arrays;
import java.util.Comparator;

class Emp implements Comparable{
	String name;
	int id;
	double sal;
	private static int num = 100;
	
	public Emp(String n,double s) {
		name = n;
		sal = s;
		id = num++;
	}
	
	@Override
	public int compareTo(Object arg) {
		Emp e = (Emp)arg;
		if(sal>e.sal) return -1;
		if(sal<e.sal) return 1;
		return 0;
	}
	
	@Override
	public String toString() {
		return "Emp[name="+name+",id="+id+",sal="+sal+"]";
	}
}



public class NonPrimitiveSort {
	
	public static void main(String[] args) {
		Emp a = new Emp("Gargi",120000.0);
		Emp b = new Emp("Tushar",52000.0);
		Emp c = new Emp("Ayan",60000.0);
		
		Emp[] arr = {a,b,c};
		
		Arrays.sort(arr);
		
		for(Emp e: arr) {
			System.out.println(e);
		}
		
		Arrays.sort(arr,new NameComparator());
		
		for(Emp e: arr) {
			System.out.println(e);
		}
	}

	
}
