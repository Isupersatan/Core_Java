package dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a the array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Sorted in ascending order by bubble sort:");
		sort(arr);
		System.out.print(Arrays.toString(arr));
		sc.close();
	}
	
	static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			boolean swapped = false;
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swapped = true;
				}
			}
			if(!swapped)	break;
		}
	}
}
