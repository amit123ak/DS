package NewProjectTest.NewProjectTest;

public class MoveAllZeroToEndFortheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		moveAllZeroToEndFortheString("32400121200");

	}

	public  static void moveAllZeroToEndFortheString(String str) {
		// TODO Auto-generated method stub
		
		int count=0;		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)!='0')
			{
			   sb.append(str.charAt(i));
			}else {
				count++;
			 }
			
		}
		
		for(int i=0;i<count;i++)
		{
			sb.append('0');
 		}
		
		System.out.println(sb.toString());
		
		
		
	}

}
