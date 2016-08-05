package javabeginnerprograms;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		System.out.println(isPrime(num)?"Prime Number":"Not a Prime Number");
	}
		public static boolean isPrime(int num){
		boolean flag=false;
		for(int i=2;i<=Math.sqrt(num);i++)
			if(num%i==0){
				return false;
			}
		return true;
		}
	}


