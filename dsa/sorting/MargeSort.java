package dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MargeSort {
	
	public static void marge(int[] a,int[] b,int[] c) {
		int i=0,j=0,k=0;
		//comparing both arr and insert element
		while(i<a.length && j<b.length) {
			if(a[i]<b[j])	c[k++]=a[i++];
			else c[k++]=b[j++];
		}
		//if after comparing any extra value left then add element
		while(i<a.length)	c[k++]=a[i++];
		while(j<b.length)	c[k++]=b[j++];
	}
	
	public static void sort(int[] a) {
		if(a.length == 1)	return;//to control recursive call
		
		//create left and right arr
		int[] lt = new int[a.length/2];
		int[] rt = new int[a.length-lt.length];
		
		//add elements in left arr
		int i=0;
		while(i<lt.length) {
			lt[i]=a[i];
			i++;
		}

		//add elements in right arr
		int j=0;
		while(j<rt.length) {
			rt[j]=a[i];
			i++;
			j++;
		}
		sort(lt);
		sort(rt);
		marge(lt,rt,a);	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a the array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Sorted in ascending order by marge sort:");
		sort(arr);
		System.out.print(Arrays.toString(arr));
		sc.close();
	}
}
