package beginnersprogram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int n=num;
		int temp=0;
		while(num>0){
			int r=num%10;
			temp=temp*10+r;
			num/=10;
			System.out.println(r+" "+temp+" "+num);
		}
		if(temp==n)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome Number");
	}
}
