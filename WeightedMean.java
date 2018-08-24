package beginnersprogram;

import java.util.Scanner;

public class WeightedMean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int X[]=new int[num];
		int W[]=new int[num];
		for(int i=0;i<X.length;i++){
			X[i]=scn.nextInt();
		}
		for(int j=0;j<W.length;j++){
			W[j]=scn.nextInt();
		}
		double weightmean=0.0;
		int resW=0;
		for(int i=0;i<num;i++){
			weightmean=weightmean+(X[i]*W[i]);
			resW=resW+W[i];
		}
		
		System.out.printf("%.1f",weightmean/resW);		
		//System.out.printf("%.1f", Math.round(weightmean/resW));
		

	}

}
