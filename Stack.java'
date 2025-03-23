
	public Node head=null;
	
class Node {
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public boolean IsEmpty()
{
	return head==null;
}

 public void push(int data)
 {
	 Node newNode=new Node(data);
	 if(IsEmpty())
	 {
		head=newNode; 
		
		return;
	 }
	newNode.next=head;
	head= newNode;
	 
	 
 }
 
 
 
 public int pop()
 {
	 if(IsEmpty())
	 {
		 return -1;
	 }
	 Node top=head;
	 head=head.next;
	 return top.data;
 }
 
 public int peek()
 {
	 if(IsEmpty())
	 {
		 return -1;
	 }
	 
	 Node top=head;
	return top.data;
 }
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack=new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		while(!stack.IsEmpty())
		{
			System.out.println(stack.peek());
			stack.pop();
			
		}


		

	}

