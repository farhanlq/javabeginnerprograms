package beginnersprogram;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		float y=scn.nextFloat();
		float account=0;
		if(x<=y){
			if(x%5==0){
			account=y-x-0.50f;	
			}
			else 
				account=y;
		}
		else 
		{
			account=y;
		}
		System.out.format("%.2f",account);
		
	}

}
