package beginnersprogram;

import java.util.Scanner;

public class BattwoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		String text=scn.nextLine();
		
		int index=scn.nextInt();
		String str="";
		if(index<text.length()-1){
		str =text.substring(index, index+2);
		}
		else{
			str=text.substring(text.charAt(0),text.charAt(2));
		}
		System.out.println(str);
			
	}

}
