package dsa.arr;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] a= {1,2,3,1,2,3};
		int len = a.length;
		Arrays.sort(a);
		
		//remove duplicates
		int j=0;
		for(int i=0;i<len-1;i++) {
			if(a[i]!=a[i+1]) {
				a[j++]=a[i];
			}
		}
		//add last element
		a[j++]=a[len-1];
		
		for(int i=0;i<j;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
