package Day6;

import java.util.*;


public class FindFrequncyofChar {
	
	public static void findFrequncyofChar(String str)
	{
		
	    HashMap<Character,Integer>map=new HashMap<Character,Integer>();
	    for(char ch:str.toCharArray())
	    {
	    	
	    	if(!map.containsKey(ch) &&  ch!=' ')
	    	{
	    		map.put(ch, 1);
	    	}else {
	    		map.put(ch, map.get(ch)+1);
	    	}
	    }
	    
	    System.out.println(map);
	    
	    for(Map.Entry<Character,Integer>entry:map.entrySet())
	    {
	    	  if(entry.getKey()!=' ')
	    	  {
	    	 System.out.println(entry.getKey()+":"+ entry.getValue());
	    	  }
	    }
		
		
	  }
		  
		  
		 
		  
			  
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String  str="Hello world";
		 //find the frequncey
		 
		 findFrequncyofChar(str);
	}

}
