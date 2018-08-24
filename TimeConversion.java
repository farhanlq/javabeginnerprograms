package beginnersprogram;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int h,m,s;
		h=n/(60*60);
	    m=(n%(60*60))/60;
	    s=(n%(60*60))%60;
		System.out.println(h+" "+m+" "+" "+s);
	}

}
