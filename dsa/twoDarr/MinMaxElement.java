package dsa.twoDarr;

public class MinMaxElement {
	
	public static int min(int[][] a) {
		int min=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]<min) {
					min2=min;
					min=a[i][j];
				}else if(a[i][j]<min2 && a[i][j]>min) {
					min2=a[i][j];
				}
			}
		}
		return min2;
	}
	
	public static int max(int[][] a) {
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>max) {
					max2=max;
					max=a[i][j];
				}
				else if(a[i][j]>max2 && a[i][j]<max) {
					max2=a[i][j];
				}
			}
		}
		return max2;
	}
	
	public static void main(String[] args) {
		int[][] arr = {{9,8,7},{6,5,4},{3,2,1}};
		System.out.println(min(arr));
		System.out.println(max(arr));
	}
}
