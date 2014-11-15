



// Implementation of Stack using Array

public class StackArray {
	
	
	private int top;
	private int[] storage;
	
	public StackArray(int capacity)
	{
		if(capacity <= 0)
		{
			throw new IllegalArgumentException("Storage capacity must be positive");
		}
		top = -1;
		storage = new int[capacity];
	}
	public StackArray() {
		// TODO Auto-generated constructor stub
	}
	
	public void push(int value)
	{
		if( top == storage.length)
		{
			throw new StackException("Stack is overflow");
		}
		top++;
		storage[top] = value;
		//System.out.println("Push " + storage[top]);		
		
	}
	public int peek()
	{
		if(top == -1)
		{
			throw new StackException("Stack is overflow");
		}
//		System.out.println("Peek " + storage[top]);
		return storage[top];
	}
	public int pop()
	{
		if(top == -1)
		{
			throw new StackException("Stack is overflow");
		}
		int poped = storage[top];
		
		top--;
		return poped;
	//	System.out.println("Pop " + poped);
		
	}
	public boolean isExmpty()
	{
		return(top == -1);
	}
	public class StackException extends RuntimeException
	{
		public StackException(String Message)
		{
			super(Message);
		}
	}
	public static void main(String agrv[])
	{
		StackArray st = new StackArray(5);
		st.push(1);
		st.push(2);
		st.push(3);
		while(!st.isExmpty())
		{
			int value = st.pop();
			System.out.println(value + " ");
		}
//		System.out.println(" ");
//		System.out.println("Stack" + st);
	}

}
