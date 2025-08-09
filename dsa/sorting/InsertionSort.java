package dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a the array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Sorted in ascending order by Insertion sort:");
		sort(arr);
		System.out.print(Arrays.toString(arr));
		sc.close();
	}
	
	static void sort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int key=a[i],j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
}
