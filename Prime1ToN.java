package beginnersprogram;

public class Prime1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
	        int i,k,j;
	        int sum=0;
	        int size=10;
	        for(i=1;i<=size;i++)
	        {
	            k=0;
	            for(j=2;j<i;j++)
	            {
	                if(i%j==0)
	                {
	                    k=1;
	                    break;
	                }
	            }
	            if(k==0)
	            {
	            	sum=sum+i;
	                //System.out.println(i);
	            }
	        }
	        
	        System.out.println(sum-1);
	    }

		
	}

}
