package beginnersprogram;

import java.util.Scanner;

public class ElementSearchRotatedArray {

	public static int search(int arr[],int l, int h, int key){
		if(l<h)
			return -1;
		int mid = (l+h)/2;
		if(arr[mid]==key)
			return mid;
		if(arr[l] <= arr[mid])
		{
			if(key >= arr[l] && key <= arr[mid])
				return search(arr,l, mid-1, key);
			return search (arr,mid+1, h,key);
		}
		if(key >= arr[mid] && key <= arr[h])
			return search(arr,mid,h+1,key);
		return search(arr,l,mid-1,key);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int key=scn.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		int i=search(arr,0,num-1,key);
		if(i!=-1)
			System.out.println(i);
		else 
			System.out.println("Key not found");
	}

}
