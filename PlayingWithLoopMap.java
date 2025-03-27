package Day6;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class PlayingWithLoopMap {
	
	public static void duplicate(int arr[])
	{
		
		Set<Integer>set=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(!set.add(arr[i]))
					{
				
				 System.out.println(arr[i]);
					}
		}
		
	    System.out.println("\n printed the set USing Enhanced  for Loop\n ");

	      for(Integer s:set)
	      {
	    	  System.out.print(s+" ");
	      }
	      
	      HashMap<Character ,Integer>map=new HashMap<>();
	      
	      map.put('a', 2);
	      map.put('b', 5);
	      map.put('c', 3);
	      
	      
	      
	    Iterator<Map.Entry<Character,Integer>>entryhas=map.entrySet().iterator();
	    System.out.println("\n printed Map Using the KeyValue Using Iterator\n ");
	    
	    while(entryhas.hasNext())
	    {
	    	
	    	Map.Entry<Character,Integer>ent=entryhas.next();
	    	
	    	
	    	System.out.print(ent.getKey()+ "  "  +ent.getValue());
	    }
	    
	    System.out.println("\n printed Map Using the KeyValue Using Map.Entry  and map.EntrySet()  \n ");
	    
	    for(Map.Entry<Character,Integer>entry:map.entrySet())
	    {
	    	
	    	System.out.println(entry.getKey() +"====== "+ entry.getValue());
	    }

	      
	    
	    System.out.println("\n Converting HashMap to KeySet()  \n ");
	    
	          Set<Character>keySet= map.keySet();
	          
	          for(Character a:keySet)
	          {
	        	   Integer n=map.get(a);
	        	  System.out.print(a+""+n);
	          }
	          
	  	    System.out.println("\n Converting HashMap to Value Set ()  \n ");

	          Set<Integer>value= new HashSet<>(map.values());
	          
	          for(Integer s:value)
	          {
	        	  
	        	  System.out.println(s);
	          }
	          

	    
//	
		
	  }
		  
		  
		 
		  
			  
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int m[]= {1,2,3,5,3,5,6,7,4,2,5,3,6};
		duplicate(m);
		
	}

}
