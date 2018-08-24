package beginnersprogram;

import java.util.Scanner;

public class Snack {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int X=scn.nextInt();
		int Y=scn.nextInt();
		float price=0;
		if(X==1){
			price=Y*4.00f;
		} else if(X==2){
			price=Y*4.50f;
		} else if (X==3){
			price=Y*5.00f;
		} else if(X==4){
			price=Y*2.00f;
		} else if(X==5){
			price=Y*1.50f;
		} 
		System.out.format("Total: R$ %.2f",price);
	}

}
