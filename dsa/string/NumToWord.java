package dsa.string;

import java.util.Scanner;

public class NumToWord {
	static String[] below20= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine",
								"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen",
								"Seventeen","Eighteen","Nineteen"};
	
	static String[] tens = {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
	
	
	
	static String twoDigit(int n) {
		if(n==0) 	return "";
		if(n<20) 	return below20[n]+" ";
		return tens[n/10]+(n % 10!=0 ? " "+below20[n % 10]:"")+" ";
		
	}
	
	static String threeDigit(int n) {
		String res = "";
		if(n > 99) {
			res += below20[n/100]+" Hundred ";
			n%=100;
		}
		if(n>0)	res += twoDigit(n);
		return res;
	}
	
	
	static String numToWords(int n) {
		if(n==0) return "Zero Rupees";
		String res = "";
		//crore
		if(n>=10000000) {
			res += twoDigit((int)(n/10000000))+"Crorer ";
			n%=10000000;
		}
		
		//lakh
		if(n>=100000) {
			res += twoDigit((int)(n/100000))+"Lakh ";
			n%=100000;
		}
		//Thousand
		if(n>=1000) {
			res += twoDigit((int)(n/1000))+"Thousand ";
			n%=1000;
		}
		
		//Hundred and Below
		if(n>0) {
			res += threeDigit((int)n);
		}
		return res.trim()+" Rupees";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a number");
		int num = sc.nextInt();
		System.out.println(numToWords(num));
		sc.close();
	}
}
