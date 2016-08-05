package javabeginnerprograms;

public class StringBufferReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="github";
		StringBuffer sb=new StringBuffer(str);
		System.out.println("Original String :- "+str);
		System.out.println("Reverse String :- "+sb.reverse());
	}

}
