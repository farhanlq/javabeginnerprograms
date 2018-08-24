package beginnersprogram;

import java.util.Scanner;

/**
 * 
 * @author FLaeeq
 *
 */
public class FirstReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String text=scn.nextLine();
		System.out.println(firstReverse(text));
	}
	public static String firstReverse(String res){
		String result="";
		for(int i=res.length()-1;i>=0;i--){
			result+=res.charAt(i);
		}
		return result;
	}

}
