package beginnersprogram;

import java.util.Scanner;

public class SingleNonDigit {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int flag=1;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length-i-1;){
				if(arr[i]==arr[j]){
					flag++;
				}
				else{
					//flag=0;
					System.out.print(arr[i]);
				}
			}
		}
		
		
	}*/
	
	public static void main(String[] args) {
		StringBuilder x = new StringBuilder("abc");
		change(x);
		System.out.println(x);
		int i = (byte) + (char) - (int) + (long) - 1;
		 
        System.out.println(i);
        
	}
	 
	public static void change(StringBuilder x) {
		x.delete(0, 2).append("cd");
		
	}

}
