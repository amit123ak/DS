package day2;

import java.util.ArrayList;

public class Stack {
	
	ArrayList<Integer> list=new ArrayList<>();
	public boolean IsEmpty()
	
	{
		return list.size()==0;
	}
	
	public void  push(int data)
	{
		
		list.add(data);
	}
	public int pop()
	{
		
		if(IsEmpty())
		{
			return -1;
		}
		int top= list.get(list.size()-1);
		list.remove(list.size()-1);
		return top;
	}
	public int peek()
	{
		
		if(IsEmpty())
		{
			return -1;
		}
		return list.get(list.size()-1);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack=new Stack();
		stack.push(1);
		stack.push(2);

		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		while(!stack.IsEmpty())
		{
			System.out.println(stack.peek());
			stack.pop();
		}




	}

}
