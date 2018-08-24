package beginnersprogram;

import java.util.Scanner;

public class ActivitySelectionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scn=new Scanner(System.in);
			int num=scn.nextInt();
			int s[]=new int[num];
			int f[]=new int[num];
			for(int i=0;i<s.length;i++){
				s[i]=scn.nextInt();
			}
			for(int j=0;j<f.length;j++){
				f[j]=scn.nextInt();
			}
			
			int i=0;
			for(int k=1;k<num;k++){
				if(s[k]>=f[i]){
					System.out.println(k);
					i=k;
				}
			}
			
	}

}
