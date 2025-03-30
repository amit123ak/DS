public class FindUniqChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindUniQCharOfString("amita kumar gond");
  
	}

	private static void FindUniQCharOfString(String str) {
		// TODO Auto-generated method stub
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<Character,Integer>();
		
		str= str.replaceAll("\\s", "");
		 for(int i=0;i<str.length();i++)
		 {
			 
			 
			 char ch=str.charAt(i);
			 map.put(ch, map.getOrDefault(ch, 0)+1);
			 
				 
		 }
      for(Map.Entry<Character,Integer>entry:map.entrySet())		
      {
    	  if(entry.getValue()==1)
    	  {
    	  System.out.print(entry.getKey());
    	  }
      }
		
	}
