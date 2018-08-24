package beginnersprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMacId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Pattern p = Pattern.compile("^[0-9A-Fa-f]{12}$");
		 Matcher m = p.matcher("000000000001");
		 boolean b = m.matches();
		 Matcher m1 = p.matcher("00000V0D0001");
		 boolean b1 = m1.matches();
		 System.out.println(b+" "+b1);
		 */		
		String serviceId="2121211111111_3456787654444444_1010101010-DRS";
		String[] accountId = serviceId.split("_");
		for(int i=0;i<accountId.length;i++){
			System.out.print(accountId[i]+"\n ");
		}
	}

}
