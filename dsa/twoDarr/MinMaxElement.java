package dsa.twoDarr;

public class MinMaxElement {
	
	public static int min(int[][] a) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
				}
			}
		}
		return min;
	}
	
	public static int max(int[][] a) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(min(arr));
		System.out.println(max(arr));
	}
}
