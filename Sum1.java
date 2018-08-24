package beginnersprogram;

import java.util.Scanner;

public class Sum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scn=new Scanner(System.in);		
		int num=scn.nextInt();
		int sum=0;
		for(int i=0;i<num;i++){
			sum+=i;
		}
		System.out.println("Sum is "+sum);
	}

}
