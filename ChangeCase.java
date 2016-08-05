package javabeginnerprograms;

import java.util.Scanner;

public class ChangeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		System.out.println("Lower Case representation of "+str+" is "+str.toLowerCase());
		System.out.println("Upper Case representation of "+str+" is "+str.toUpperCase());
	}

}
