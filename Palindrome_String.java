package javabeginnerprograms;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner scn=new Scanner(System.in);
		String text=scn.nextLine();
		String  rev="";
		for(int i=0;i<text.length();i++)
			rev+=text.charAt(i);
	
		if(text.equals(rev)){
		System.out.println(text+" is a palindrome String");
		}
		else{
		System.out.println(text+" is not a Palindrome String");	
		}
	}
}

