package beginnersprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SumsInATriangle {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		System.out.println("reps");
		String reps = br.readLine();
		Integer rep = Integer.parseInt(reps);
		for (int i = 0; i < rep; i++) {
			String lines = br.readLine();
			int line = Integer.parseInt(lines);
			makeTriangle(line);
		}
	}
	public static void makeTriangle(int lines) throws IOException
	{
		int[][] triangle = new int[lines][lines];
		for (int k = 0; k < lines; k++) {
			String[] testArray = br.readLine().split(" ");
			for(int l=0;l<testArray.length;l++)
			{
				triangle[l][k] = Integer.parseInt(testArray[l]);
			}
		}
	}
}
