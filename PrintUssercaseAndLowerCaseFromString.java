package NewProjectTest.NewProjectTest;

import java.util.Arrays;

public class PrintUssercaseAndLowerCaseFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aBACbcEDed";
	String str=	s.replaceAll("[a-z]", "");
	String str2=	s.replaceAll("[A-Z]", "");
	
	char ch[]=str.toCharArray();
	char ch2[]=str2.toCharArray();
	
	Arrays.sort(ch);
	
	Arrays.sort(ch2);

	
	System.out.println(Arrays.toString(ch)+"  "+Arrays.toString(ch2));
	
	for(int i=0;i<ch.length;i++)
	{
		System.out.print(ch[i]);
	}
	System.out.println();
	
	for(int i=0;i<ch.length;i++)
	{
		System.out.print(ch2[i]);
	}
	

	}

}
