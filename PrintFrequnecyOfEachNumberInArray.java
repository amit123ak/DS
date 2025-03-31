package NewProjectTest.NewProjectTest;

import java.util.HashMap;
import java.util.Map;

public class PrintFrequnecyOfEachNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] arr = {1, 2, 3, 2, 1, 5, 1, 6, 2, 5, 5, 5};
        
        printFrequnecyOfEachNumberInArray(arr);

		
		

	}

	public  static void printFrequnecyOfEachNumberInArray(int[] arr) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer>freqmap=new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
		
		freqmap.put(arr[i], freqmap.getOrDefault(arr[i], 0)+1);
		
		}
		
	for(Map.Entry<Integer, Integer>entry:freqmap.entrySet())
	{
		
		System.out.println(entry.getKey()+"--->"+ entry.getValue());
	}
		
	}

}
