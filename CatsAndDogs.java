package beginnersprogram;

import java.util.Scanner;

public class CatsAndDogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);	
		int tc=scn.nextInt();
		for(int i=0;i<tc;i++){
		int c=scn.nextInt();
		int d=scn.nextInt();
		int l=scn.nextInt();
		if(l==8)
			System.out.println("Yes");
		else if(l==4)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	}	
}
