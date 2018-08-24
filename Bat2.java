package beginnersprogram;

import java.util.Scanner;

public class Bat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int sum=0;
		int arr[]=new int[num];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
			}
		if(arr.length>=2){
			for(int j=0;j<arr.length;j++){
			sum=sum+arr[j];
			}}
		else if(arr.length<2){
			for(int k=0;k<arr.length;k++){
				sum=sum+arr[k];
			}
		}
		//else if(arr.length==0)
	}

}
