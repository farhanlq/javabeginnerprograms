package beginnersprogram;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int arr[]={1,2,4,5};
		int actualsum=0;
		int expectsum=0;
		for(int i=0;i<num;i++){
			expectsum=expectsum+(i+1);
		}
		
		for(int j=0;j<arr.length;j++){
			actualsum=actualsum+arr[j];
		}
		System.out.println(expectsum-actualsum);
		
		
		

	}

}
