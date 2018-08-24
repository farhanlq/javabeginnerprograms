package beginnersprogram;

import java.util.Scanner;

public class LastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int M=scn.nextInt();
		int A[]=new int[N];
		for(int i=0;i<N;i++){
			A[i]=scn.nextInt();
		}
		
		int count=0;
		int index=0;
		for(int i=0;i<N;i++){
			if(A[i]==M)
				count++;
				index=i;
		}
		System.out.println((index+1));
	}

}
