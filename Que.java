package day2;

public class Que {
	private static  int rear=-1;
	private  int   arr[];
	private  int size;


	
	
		 

		//public  int rear=-1;
	    Que(int n)
		 {
			 
			 size=n;
			 arr=new int[n];
	     	 rear=-1;
			 
		 }
		  
	 
	 
	 public static  boolean isEmpty()
	 {
		 
		 return rear==-1;
	 }
	 public  boolean IsFull()
	 {
		 return rear==size-1;
	 }
	 
	 public void add(int data) {
		 
		 if(IsFull())
		 {
			 System.out.println("Quque is overflow");
			 return;
		 }
		 rear++;
		 arr[rear]=data;
	 }
	 
	 public  int remove()
	 { 
		 if(isEmpty())
		 {
			 System.out.println(" quque is empty");
			 return -1;
			 
		 }
		 int front=arr[0];
		 for(int i=0;i<rear;i++)
		 {
			 
			 arr[i]=arr[i+1];
		 }
		 rear--;
		 return front;
	 }
	 
	 public int peek()
	 {
		 if(isEmpty())
		 {
			 System.out.println(" quque is empty");
			 return -1;
			 
		 }
		 int front=arr[0];
		
		 return front;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que q=new Que(3);
		
		q.add(1);
		q.add(2);
		q.add(3);
		
		  System.out.println(q.remove());
	      System.out.println(q.peek());

	}

}
