package NewProjectTest.NewProjectTest;

import java.util.Arrays;

public class SperateLowerAndUpper {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
sperateLowerAndUpperCases("aBACbcEDed");

	}

	public  static void sperateLowerAndUpperCases(String str) {
		// TODO Auto-generated method stub
		
		   String lowercase= str.replaceAll("[^a-z]", "");
		   String uppercase=str.replaceAll("[^A-Z]", "");
		   
		  char upper[]= uppercase.toCharArray();
		  Arrays.sort(upper);
		  
		  char lower[]=lowercase.toCharArray();
		  Arrays.sort(lower);
		  
		   System.out.print("  Upper:  ");

		   for(int i=0;i<upper.length;i++)
		   {
			   
			   System.out.print(upper[i]);
		   }
		   System.out.println();
		   System.out.print("  lower:  ");
		   for(int i=0;i<lower.length;i++)
		   {
			   
			   System.out.print(lower[i]);
		   }
		   
		   

		   
	}
		   
		
	

}
