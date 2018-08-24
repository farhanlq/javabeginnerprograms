package beginnersprogram;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int r=scn.nextInt();
		int c=scn.nextInt();
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print("**** ");
				System.out.print("\n*...* ");
				}
			System.out.println();
		}
		//System.out.println("****");
	}

}
