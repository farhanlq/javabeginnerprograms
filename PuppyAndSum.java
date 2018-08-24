package beginnersprogram;

import java.util.Scanner;

public class PuppyAndSum {

	public static void main(String...s){

		Scanner scn=new Scanner(System.in);
		int tc=scn.nextInt();
		for(int t=0;t<tc;t++){
			int d=scn.nextInt();
			int n=scn.nextInt();
		int res=0;
		int sum=0;
		if(d==1)
		 res=sum(n);
		else
			for(int i=0;i<d;i++){
				res=sum(n);
				n=res;
			}
		System.out.println(res);
		}
			
	}

	public static int sum(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		return sum;
	}
}
