package javabeginnerprograms;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		int res;
		int num=15;
		System.out.println("Fibonacci Series are :- ");
		System.out.print(first+" "+second+" ");
		for(int i=0;i<num-2;i++){
			res=first+second;
			System.out.print(res+" ");
			first=second;
			second=res;
		}
	}

}
