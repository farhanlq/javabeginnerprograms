package beginnersprogram;

import java.util.Scanner;

public class Pattern_1 {
	public static void main(String...s){
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		if(num>5)
		for(int i=0;i<num;i++){
			for(int j=0;j<num-1;j++){
			System.out.print("*");
		}
			System.out.println();
		}
	}
}
