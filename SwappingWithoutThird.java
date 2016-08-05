package javabeginnerprograms;

import java.util.Scanner;

public class SwappingWithoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		System.out.println("Values of a and b before swapping "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Values of a and b after swapping "+a+" "+b);
		}

}
