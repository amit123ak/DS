public class PushAllZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
		
		pushAllZeroToEnd(arr);


	}

	private static void pushAllZeroToEnd(int[] arr) {
		// TODO Auto-generated method stub
		
		int temp[]=new int [arr.length];
		int n= arr.length;
		
		int j=0;
		for(int i=0;i<n;i++)
		{
			
			if(arr[i]!=0)
			{
				temp[j++]=arr[i];
				
			}
			
		}
		while(j<n)
		{
			temp[j]=0;
			j++;
		}
		
		for( j=0;j<temp.length;j++)
		{
			System.out.print(temp[j]);
		}
	}

}
