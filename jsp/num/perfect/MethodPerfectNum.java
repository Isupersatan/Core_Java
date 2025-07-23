package jsp.num.perfect;
import  java.util.Scanner;
public class MethodPerfectNum {
	
	public static boolean isPerfect(int n) {
		int sum=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)	sum+=i;
		}
		return sum==n;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Num");
		int num = sc.nextInt();
		System.out.println(isPerfect(num));
		sc.close();
	}
}
