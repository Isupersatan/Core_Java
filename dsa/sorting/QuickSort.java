package dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	
	static void quickSort(int[] a,int start,int end) {
		if(start>=end)	return;
		int i=start,j=end;
		int pivot = a[(start+end)/2];
		
		while(i<=j) {
			while(a[i]<pivot)	i++;
			while(a[j]>pivot)	j--;
			
			if(i<=j) {
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		quickSort(a,start,j);
		quickSort(a,i,end);
	}
	
	static void sort(int[] a) {
		quickSort(a,0,a.length-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a the array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Sorted in ascending order by quick sort:");
		sort(arr);
		System.out.print(Arrays.toString(arr));
		sc.close();
	}
}
