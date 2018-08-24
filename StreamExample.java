package beginnersprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String...s){
		
		List<Integer> l=new ArrayList<>();
		l.add(41);
		l.add(2);
		l.add(55);
		l.add(42);
		l.add(321);
		
		long count=l.stream().count();
		System.out.println(count);
		
		Integer findEle=l.stream().findAny().get();
		System.out.println(findEle);
		
		Integer max=l.stream().max((a, b) -> a - b).get();
		System.out.println(max);
		
		Integer min=l.stream().min((a, b) -> a - b).get();
		System.out.println(min);
		
		
		
	}
}
