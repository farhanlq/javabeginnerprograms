package beginnersprogram;

import java.util.Scanner;

public class Java_End_Of_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int lineNum=1;
		while(scn.hasNextLine()==true){
			if(scn.hasNext()==true)
				System.out.println(lineNum + " " + scn.nextLine());
				lineNum++;
		}
		
	}

}
