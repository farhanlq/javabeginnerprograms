package beginnersprogram;

import java.util.Scanner;

public class YakRemove {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
	
		String result = "";
		  
		  for (int i=0; i<str.length(); i++) {
		    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
		      i =  i + 2;
		    } else { 
		      result = result + str.charAt(i);
		    }
		  }
		  System.out.println(result);
	scn.close();
	}

}
