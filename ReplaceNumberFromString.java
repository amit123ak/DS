package NewProjectTest.NewProjectTest;

public class ReplaceNumberFromtheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Subbu123raj";
		String ch[]=s.split("[a-zA-Z]");
		for(int i=0;i<ch.length;i++)
		{
			 if(!ch[i].isEmpty())
			 {
				 System.out.println(ch[i]);
			 }
		}
		s=s.replaceAll("[0-9]", "");
		
		 
		System.out.println(s);

	}

}
