package NewProjectTest.NewProjectTest;

public class PrintString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="a2b2c3d2";
		
		
		for(int i=0;i<s.length();i+=2)
		{
			int n= s.charAt(i+1)-'0';
			for(int j=0;j<n;j++)
			{
				System.out.print(s.charAt(i));
			}
			
			
		}
				

	}

}
