package beginnersprogram;

import java.util.Scanner;

public class RecursionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=i;j++){
			arr[i][j]=scn.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=i;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
