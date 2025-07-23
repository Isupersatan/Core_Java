package jsp.num.factorial;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Num: ");
		int num = sc.nextInt();
		int prod = 1;
		for(int i=1;i<=num;i++){
			prod *= i;
		}
		System.out.print("factorial of "+num+" is : "+prod);
		sc.close();
	}
}
