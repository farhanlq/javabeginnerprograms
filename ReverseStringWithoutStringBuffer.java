package javabeginnerprograms;

public class ReverseStringWithoutStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="xavient";
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length()/2;i++){
			char temp=arr[i];
			arr[i]=arr[str.length()-1-i];
			arr[str.length()-1-i]=temp;
		}	
		String rev="";
		for(int i=0;i<arr.length;i++)
			rev+=arr[i];
		System.out.println(rev);
	}

}
