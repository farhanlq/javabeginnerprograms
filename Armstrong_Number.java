package javabeginnerprograms;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int temp=num;
		int sum=0;
		while(temp!=0){
			int r=temp%10;
			sum=sum+r*r*r;
			temp=temp/10;
			
		}
		if(num==sum)
			System.out.println(num+" is an Armstrong Number");
		else
			System.out.println(num+" is not an Armstrong Number");
	}

}
