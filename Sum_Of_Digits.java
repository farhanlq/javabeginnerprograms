package javabeginnerprograms;

import java.util.Scanner;

public class Sum_Of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int sum=0;
		int temp=num;
		for(int i=0;i<num;i++){
			int r=temp%10;
			sum+=r;
			temp/=10;
		}
		System.out.println("Sum of Digits in "+num+" are :- "+sum);
		
	}

}
