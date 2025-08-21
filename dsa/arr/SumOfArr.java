package dsa.arr;

import java.util.Scanner;

public class SumOfArr {
	
	static void sumOfArr(int[] a,int[] b) {
		
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of 1st and 2nd arr");
	int s1 = sc.nextInt();
	int[] a1= new int[s1];
	int s2 = sc.nextInt();
	int[] a2= new int[s1];
	System.out.println("Enter the 1st arr");
	
	for(int i=0;i<s1;i++)
		a1[i]=sc.nextInt();
	
	for(int i=0;i<s2;i++)
		a2[i]=sc.nextInt();
		
	}
}
