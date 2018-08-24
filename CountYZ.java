package beginnersprogram;

import java.util.Scanner;

public class CountYZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		//System.out.println(str);
		String res="";
		for(int i=0;i<str.length()-1;i++){
		if(str.charAt(i)=='p'&&str.charAt(i+1)=='i'){
		res=res+"3.14";
		}
		else{
			res+=str.charAt(i);
		}
		
		}
		System.out.println(res);
	}

}
