package beginnersprogram;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(123);
		al.add(34);
		al.add(312);
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			Integer integer=(Integer) itr.next();
			al.add(341);//ConcurrentModificationException (FailFastIterator)
		} 
	}

}
