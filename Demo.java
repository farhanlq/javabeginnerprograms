package beginnersprogram;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String partyName="1101519157924_8245112400137048";
		String spa = partyName.substring(14, 18)+"_"+partyName.substring(18, 20)+"00_"+partyName.substring(20, 24);
		System.out.println(spa);

	}

}
