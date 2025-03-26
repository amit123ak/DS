
public class newTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = { 1, 0, 2, 0, 3, 0 };

	
        // shift all zero to the first place 
        
         int end =-1;
         for(int i=arr.length-1;i>=0;i++)
         
         {
        	    if(arr[i]==0)
        	    {
        	    	end=i;
        	    	break;
        	    }
         }
         
         
         for(int i=end-1;i>=0;i--)
         {
        	 
        	 if(arr[i]!=0)
        	 {
        		 int temp=arr[i];
        		 arr[i]=arr[end];
        		 arr[end]=temp;
        		 end--;
        	 }  
        	 
         }

 for(int i=0;i<arr.length;i++)
 {
	 System.out.print(arr[i]);
 }

	}}

