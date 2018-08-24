package beginnersprogram;

import java.util.Scanner;

public class Day12Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int A[][]=new int[a][b];
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				A[i][j]=scn.nextInt();
			}
		}
		int l=scn.nextInt();
		int m=scn.nextInt();
		int B[][]=new int[l][m];
		for(int i=0;i<l;i++){
			for(int j=0;j<m;j++){
				B[l][m]=scn.nextInt();
			}
		}
		
		int C[][]=new int[a][b];
		for(int k=0;k<a;k++){
			for(int o=0;k<b;k++){
				C[k][o]=A[k][o]+B[k][o];
			}
		}
		
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
			
		}
	}

}
