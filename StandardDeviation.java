package beginnersprogram;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StandardDeviation {
	
	public static double mean(int a[]){
		double mean=0.0;
		for(int i=0;i<a.length;i++){
			mean+=a[i];
		}
		mean=mean/a.length;
		return mean;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		double meanValue=mean(arr);
		//System.out.println(meanValue);
		
		int arr2[]=new int[num];
		for(int i=0;i<arr.length;i++){
			arr2[i]=(int) Math.pow(arr[i]-meanValue,2);
		}
		
		int sdValue=(int) mean(arr2);
		double sd=Math.sqrt(sdValue);
		System.out.printf("%.1f",sd);
		
		/*DecimalFormat dff=new DecimalFormat(".#");

		System.out.println(dff.format(sd));*/
		
	}

}
