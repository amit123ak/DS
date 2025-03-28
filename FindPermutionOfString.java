package NewProjectTest.NewProjectTest;

public class FindPermutionOfString {
	
	
	 public static void  StringPermution(String prefix,String str)
	 {
		int length= str.length();
		if(length==0)
		{
			System.out.println(prefix);
			return;
			
		}else {
			
			for(int i=0;i<length;i++)
			{
				
				StringPermution(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,length));
			}
			
		}
		
		 
	 }
	 public static void permution(String str)
	 {
		 
		 StringPermution("","123");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="123";
		
		permution(str);

	}

}
