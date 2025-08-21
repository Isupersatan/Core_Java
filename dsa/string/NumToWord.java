package dsa.string;

import java.util.Scanner;

public class NumToWord {
	static String[] below20= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine",
								"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen",
								"Seventeen","Eighteen","Nineteen"};
	
	static String[] tens = {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
	
	static String[] bigs = {"","Thousand","million","billion"};
	
	static String words(int n) {
		if(n==0) 	return "";
		if(n<20) 	return below20[n]+" ";
		if(n<100)	return tens[n/10]+" "+words(n%10);
		return	below20[n/100]+" Hundred "+words(n%100);
	}
	
	static String numToWords(int num) {
		if(num==0) return "Zero";
		int i=0;
		String res = "";
		while(num>0) {
			if(num%1000!=0) res = words(num%1000)+" "+bigs[i]+" "+res;
			num/=1000;
			i++;
		}
		return res.trim();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a number");
		int num = sc.nextInt();
		System.out.println(numToWords(num));
		sc.close();
	}
}
