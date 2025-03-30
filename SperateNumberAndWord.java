package NewProjectTest.NewProjectTest;

import java.util.Arrays;

public class SperateNumberAndWord {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
sperateNumberAndWord("Subbu123raj");

	}

	public  static void sperateNumberAndWord(String str) {
		// TODO Auto-generated method stub
		
		   String name= str.replaceAll("[^a-zA-Z]", "");
		   String num=str.replaceAll("[^0-9]", "");
		   
		   
	
            System.out.println(name);
            System.out.println(num);
		   
	}
		   
		
	

}
