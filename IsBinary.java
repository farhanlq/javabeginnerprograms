package javabeginnerprograms;

import java.util.Scanner;

public class IsBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number in binary format");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(isBinary(n)?" Binary Number ":" Not a Binary Number ");
	}
	
	public static boolean  isBinary(int num){
		while(num!=0){
			if(num%10>1){
				return false;
			}
			
		}
		return true;
		
	}
}
