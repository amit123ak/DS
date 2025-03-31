package day7;

import java.util.HashSet;

public class FindDuplicateNumber {
	
	public static void main(String[] args) {
		
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1, 9,1,1,2,1};

		findDuplicateNumber(arr);
		
		
		
		
	}

	public static void findDuplicateNumber(int[] arr) {
		// TODO Auto-generated method stub
		
		HashSet<Integer>uniq=new HashSet<>();
		HashSet<Integer>duplicate=new HashSet<>();

		
		for(int i=0;i<arr.length;i++)
		{
			if(!uniq.add(arr[i]))
			{
				duplicate.add(arr[i]);
			}
		}
		

		System.out.println("\n printed duplcate number");

		for(Integer num:duplicate)
		{
			System.out.print(num+" ");
		}
		System.out.println("\n printed uniq number");
		for(Integer num:uniq)
		{
			System.out.print(num+" ");
		}
	}

}
