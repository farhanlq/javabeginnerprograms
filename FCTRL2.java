package beginnersprogram;

import java.util.Scanner;

public class FCTRL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int tc=scn.nextInt();
		int arr[]=new int[tc];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		int resarray[]=new int[tc];
		for(int j=0;j<arr.length;j++){
			int fact=1;
			int num=arr[j];
			for(int k=1;k<=num;k++){
				fact=fact*k;
			}
			resarray[j]=fact;
		}
		for(int i=0;i<resarray.length;i++){
			System.out.println(resarray[i]);
		}
		}
}
