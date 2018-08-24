package beginnersprogram;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vecotrName=new Vector<>(6);
		System.out.println(vecotrName.isEmpty());
		vecotrName.addElement(4);
		vecotrName.addElement(34);
		vecotrName.addElement(124);
		System.out.println(vecotrName.size());
		System.out.println(vecotrName.contains(34));
		System.out.println(vecotrName.isEmpty());
		vecotrName.add(2,452);
		System.out.println(vecotrName);
		System.out.println(vecotrName.get(3));
		//vecotrName.set(5, 234);
		
		
	}

}
