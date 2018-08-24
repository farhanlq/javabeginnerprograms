package beginnersprogram;

import java.util.ArrayList;

public class Array_2d {

 public static	ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());
        
            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList <Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		ArrayList <Integer> al1=new ArrayList<Integer>();
		al1.add(5);
		al1.add(6);
		al1.add(7);
		al1.add(8);
		ArrayList <Integer> al2=new ArrayList<Integer>();
		al2.add(9);
		al2.add(10);
		al2.add(11);
		al2.add(12);
		A.add(al);
		A.add(al1);
		A.add(al2);
		
		
		
		ArrayList<ArrayList<Integer>> B = performOps(A);
		for (int i = 0; i < B.size(); i++) {
		    for (int j = 0; j < B.get(i).size(); j++) {
		            System.out.print(B.get(i).get(j) + " ");
		    }
		}
	}

}
