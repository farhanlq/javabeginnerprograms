package beginnersprogram;

import java.util.Arrays;
import java.util.Scanner;

public class MeanMedianMode {
	
	public static int mode(int a[]) {
	    int maxValue = 0, maxCount = 0;

	    for (int i = 0; i < a.length; ++i) {
	        int count = 0;
	        for (int j = 0; j < a.length; ++j) {
	            if (a[j] == a[i]) ++count;
	        }
	        if (count > maxCount) {
	            maxCount = count;
	            maxValue = a[i];
	        }
	    }

	    return maxValue;
	}

	public static double mean(int a[]){
		double mean=0.0;
		for(int i=0;i<a.length;i++){
			mean+=a[i];
		}
		mean=mean/a.length;
		return mean;
		
	}
	
	public static double median(int a[]){
		double median=0.0f;
		Arrays.sort(a);
		if(a.length%2==0){
			median=(a[a.length/2-1]+a[a.length/2])/2.0;
		}
		return median;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int arr[]=new int[num];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
					}
		
		System.out.println("Mean is "+mean(arr));
		System.out.println("Median is "+median(arr));
		System.out.println("Mode is "+mode(arr));
		
		
		}

}
