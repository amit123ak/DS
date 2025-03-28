package Day6;

import java.util.*;


public class NumberOfWordA {
	
	public static void NumberOfWord(String str)
	 {
		
		String s[]=str.split("\\s+");
		
	     
		System.out.println(s.length);
		// find the duplicate 
		
		LinkedHashSet<String>set=new LinkedHashSet<>();
	 
		  for(int i=0;i<s.length;i++)
		  {
			  
			  
			  if(!set.add(s[i]))
			  {
				  
				  System.out.println(s[i]);
			  }
			  
		  }
		  
		  // removed duplicate of the string 
		  System.out.println("/n printed and removed duplicate");
		  for(String s1:set)
		  {
			  System.out.println(s1);
		  }
		
	  
		
	  }
		  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="amit amit kumar gond indu gond gone to his indu";
		 
		NumberOfWord(str);
	}

}
