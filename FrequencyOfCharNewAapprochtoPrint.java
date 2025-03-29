package NewProjectTest.NewProjectTest;

import java.util.HashMap;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String str="aabbccddeee";
	  FindUniqchar(str);

	}

	private static void FindUniqchar(String str) {
		// TODO Auto-generated method stub
		
		
		
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		boolean []printed=new boolean[256];
		
		for(int i=0;i<str.length();i++)
			
		{   char ch=str.charAt(i);
			
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}else {
				map.put(ch, map.get(ch)+1);
			}
		}
		boolean flag=false;
		for(char ch:str.toCharArray())
		{
			
			
			if(printed[ch])
			{
				continue;
			}
			
			if(map.containsKey(ch))
			{
				System.out.print(ch+""+map.get(ch));
				printed[ch]=true;
			}
		}
		
		
	}

}
