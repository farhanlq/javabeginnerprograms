package beginnersprogram;

import java.util.Scanner;

public class DemoProgram {

	public static String checkDevice(String device4mMacId, String device4mSerialNum, String device4mfqdn) {
		if (device4mfqdn.equals(device4mSerialNum) && device4mMacId.equals(device4mSerialNum))
			return "Success";
		else
			return "Error";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String device4mMacId = scn.nextLine();
		String device4mSerialNum = scn.nextLine();
		String device4mfqdn = scn.nextLine();
		System.out.println(checkDevice(device4mMacId, device4mSerialNum, device4mfqdn));

	}

}
