package NewProjectTest.NewProjectTest;

public class MoveAllZeroToFirstTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		moveAllZeroToFirst("32400121200");

	}

	public  static void moveAllZeroToFirst(String str) {
		// TODO Auto-generated method stub
	
		char str1[]=str.toCharArray();
		int count=0;
		String s1="";
		for(int i=0;i<str1.length;i++)
		{
			
			if(str1[i] =='0')
			{
			  count++;	
			}
		}
		
		for(int i=0;i<count;i++)
		{
			
			s1+='0';
		}
		
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i]!='0')
			{
			   s1+=str1[i];
			}
		}
		System.out.println(s1);
		
		
	}

}
