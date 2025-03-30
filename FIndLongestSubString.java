package NewProjectTest.NewProjectTest;
import java.util.*;

public class FIndLongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        findLongestSubString("abcabcbb");

	}

	private static void findLongestSubString(String str) {
		// TODO Auto-generated method stub
		HashSet<Character>set=new HashSet<>();
		int start=0;
		int max=0;
		
		for(int i=0;i<str.length();i++)
		{
			
			char ch=str.charAt(i);
			
			
			 while(set.contains(ch))
			 {
				 set.remove(str.charAt(start));
				 start++;
			 }
			 
			 set.add(ch);
			 
			max= Math.max(max, i-start+1);
		}
		
		System.out.println(max);
		
	}

}
