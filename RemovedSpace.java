package NewProjectTest.NewProjectTest;

public class RemovedSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str = " Java Programming ";
        
        removedspace(str);

	}

	public  static void removedspace(String str) {
		// TODO Auto-generated method stub
		
     str=str.replaceAll("\\s", "");
	System.out.println(str);
	
	StringBuilder stringbuilder=new StringBuilder();
	
	for(int i=0;i<str.length();i++)
	{
		
		if(str.charAt(i)!=' ')
		{
		stringbuilder.append(str.charAt(i));
		}
	}
	System.out.println(stringbuilder.toString());

		
		
		   String str2[]=str.split("\\s+");
		   
		   for(int i=0;i<str2.length;i++)
		   {
			  if(!str2[i].isEmpty())
			  {
				  System.out.print(str2[i]);
			  }
		   }
		
	}
	

}
