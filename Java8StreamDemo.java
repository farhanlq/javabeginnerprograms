package beginnersprogram;

import java.util.ArrayList;
import java.util.List;

public class Java8StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Arrays.stream(new int[] {1, 2, 3,4,5}) .map(n -> 2 * n + 5)
		 * .average() .ifPresent(System.out::println);
		 * 
		 * int arr[]={1,44,22,28,15}; Arrays.parallelSort(arr);
		 * 
		 * for(int i:arr){ System.out.print(i+" "); }
		 */
		for (int i = 1; i < 5; i++) {
			if (i == 3)
				break;
			else
				System.out.print(i + " ");
		}
	}
}