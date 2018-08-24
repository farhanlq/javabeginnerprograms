package beginnersprogram;

import java.util.Scanner;

public class BadWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		System.out.println(badWordChecker(text));
		
	}
	
	public static boolean badWordChecker(String text){
		if(text.length()>3)
			if(text.charAt(0)=='b' && text.charAt(1)=='a' && text.charAt(2)=='d' 
			|| text.charAt(1)=='b' && text.charAt(2)=='a' && text.charAt(3)=='d'){
				return true;
			}
			else 
				return false;
		return false;
		
				
				
		
	}

}
