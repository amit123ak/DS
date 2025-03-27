
import java.util.Set;

import org.apache.poi.util.SystemOutLogger;

public class Test {
	
	public static void duplicate(int arr[])
	{
		
		Set<Integer>set=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(!set.add(arr[i]))
					{
				
				 System.out.println(arr[i]);
					}
		}
	}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int m[]= {1,2,3,5,3,5,6,7,4,2,5,3,6};
		duplicate(m);
		
	}

}
