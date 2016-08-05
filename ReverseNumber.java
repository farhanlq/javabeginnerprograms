package javabeginnerprograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4523;
		int rev=0;
		int temp=num;
		while(temp!=0){
			int r=temp%10;
			rev=rev*10+r;
			temp=temp/10;
		}
		System.out.println("Original Number :- "+num);
		System.out.println("Reverse Number :- "+rev);
	}

}
