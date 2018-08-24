package beginnersprogram;

import java.util.Scanner;

public class RiseAndFall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		for (int i = 0; i < tc; i++) {
			double n = scn.nextLong();
			int k = scn.nextInt();
			double res = Math.pow(n, n);
			String result = String.valueOf((double) res);
			String first = "";
			String last = "";
			first = result.substring(0, k);
			last = result.substring((result.length() - k), result.length());
			StringBuffer sb = new StringBuffer(last);
			System.out.println(first + " " + last);
		}
	}

}
