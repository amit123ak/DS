package day3;

import java.util.Stack;
public class StackProm {
	
	
	public static void pushButton(Stack<Integer>s,int data)
	{
		if(s.isEmpty())
		{
			
			s.push(data);
			return;
		}
		int temp=s.pop();
		pushButton(s,data);
		s.push(temp);
		
		
		
	}
	public static  void reverse(Stack<Integer>s)
	{
	     if(s.isEmpty())
	     {
	    	 return ;
	     }
	     int top=s.pop();
	     reverse(s);
		pushButton(s,top);

	     
	     
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer>stack=new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//pushButton(stack,4);
		reverse(stack);
		 while(!stack.isEmpty()) {
	            System.out.println(stack.pop());
	        }
		
		 
		 
		
		



	}

}
