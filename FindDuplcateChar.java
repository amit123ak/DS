package Day6;


public class Test {
	
	
	public static void freq(String str)
	{
		
		
		 boolean []print=new boolean [256];
	   
	   for(int i=0;i<str.length();i++)
	   {
		    int count=1;
		    
		    if(print[str.charAt(i)])
		    {
		    	
		    	continue;
		    }

	   for(int j=i+1;j<str.length();j++)
	   {
		   
		    if(str.charAt(i)==str.charAt(j))
		    {
		    	count++;
		    }
	   }
	   
	     if(count>1)
	     {
	    	 System.out.println(str.charAt(i));
	    	 
	    	 print[str.charAt(i)]=true;
	     }
	   }
//	
//	     
	  }
		  
		  
		 
		  
			  
			  
		  
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="amitamitamita";
		 freq(str);

	}

}
