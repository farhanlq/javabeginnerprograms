package javabeginnerprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println("The Factorial of "+num+" is  "+fact);
	}

}
