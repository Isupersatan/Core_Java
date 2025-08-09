package dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a the array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Sorted in ascending order by selection sort:");
		sort(arr);
		System.out.print(Arrays.toString(arr));
		sc.close();
	}
	
	static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int indx = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[indx]>a[j])	indx = j;
			}
			if(i!=indx) {
				int temp = a[i];
				a[i] = a[indx];
				a[indx] = temp;
			}
		}
	}
}
