package beginnersprogram;

import java.util.ArrayList;

public class ArrayListRotate {

	public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < A.size(); i++) {
			ret.add(A.get((i + B)%A.size()));
		}
		return ret;
	}
	
	
	public static int isPrime(int A) {
		int upperLimit = (int)(Math.sqrt(A));
		for (int i = 2; i <= upperLimit; i++) {
			if (i < A && A % i == 0) return 0;
			break;
		}
		return 1;
	}
	
	
	public static void main(String...s){
	ArrayList<Integer> al=new ArrayList();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
	al.add(6);
	int pos=1;
	System.out.println(rotateArray(al,pos));
	//System.out.println(res);
	System.out.println(isPrime(19));
	
	}
}
