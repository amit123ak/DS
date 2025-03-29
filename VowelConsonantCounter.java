package NewProjectTest.NewProjectTest;

public class VowelConsonantCounter {

	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hellow team";
		
		CountVawelConsonat(str);

	}

	private static void CountVawelConsonat(String str) {
		
		
		// TODO Auto-generated method stub
		
		String vawel="aeiou";
		String s=str.toLowerCase();
		int vawelcount=0, consonCount=0;
		
		for(int i=0;i<s.length();i++)
		{
			
			char ch=s.charAt(i);
			
			if(Character.isLetter(ch))
			{
				
				if(vawel.indexOf(ch)!=-1)
				{
					vawelcount++;
					
				}else {
					consonCount++;
				}
				
			}
		}
		System.out.println("vawelcount="+ vawelcount+ "consonCount=" + consonCount);
		
		
	}

}
