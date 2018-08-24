package beginnersprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Quartiles {
	public static void main(String...s){
		
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		int mid=num/2;
		
		System.out.println(arr[mid]);
		
		for(int j=0;j<mid;j++){
			System.out.print(arr[j]+" ");
		}
		
		System.out.println();
		
		for(int k=mid;k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}
	}

}
