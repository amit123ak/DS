package NewProjectTest.NewProjectTest;

public class SwapStringWithoutThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="amit";
		String s2="indrawati";
		
	swapTheStringWithOutThirdVar(s1,s2);

	}

	public static void swapTheStringWithOutThirdVar(String s1, String s2) {
		// TODO Auto-generated method stub
		
		s1=s1+s2;         //    amitindrawati
		
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("s1="+""+ s1);
		System.out.println("s2="+""+ s2);

		
		
		
		
	}

}
