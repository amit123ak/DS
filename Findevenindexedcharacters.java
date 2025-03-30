package NewProjectTest.NewProjectTest;

public class Findevenindexedcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="amitkumar";
		
		findevenindexedcharacters(str);

	}

	private static void findevenindexedcharacters(String str) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				System.out.println(str.charAt(i)+ " "+ i);
				
			}
		}
		
	}

}
