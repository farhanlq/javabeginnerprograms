package beginnersprogram;

import java.util.Scanner;

public class Bat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String result = "";
		for (int i = 0; i < str.length() - 3; i++) {
			if (str.charAt(i) == 'y' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 'k') {

			} else
				result += str.charAt(i);
		}
		System.out.println(result);
	}

}
