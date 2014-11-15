
//Implementation of Stack using LinkedList using nested class (Stactic class)

public class StackLinkedList {

	public static void main(String argv[])
	{
		ListStack ls = new ListStack();
		ls.push(10);
		ls.push(20);
		ls.push(30);
		ls.display();
		ls.getSize();
		ls.pop();
		ls.display();
		ls.getSize();
		ls.push(50);
		ls.display();
	}
	static class ListStack
	{
		private Node first;
		private int size = 0;
		
		public ListStack()
		{
			first = null;
		}
		public boolean isEmpty()
		{
			return first == null;
		}
		public void push(int value)
		{
			Node newNode = new Node(value);
			newNode.next = first;
			first = newNode;
			size++;
		}
		
		public Node pop()
		{
			Node temp = first;
			first = first.next;
			size--;
			return temp;
		}
		public void display()
		{
			System.out.println("Stack: ");
			Node current = first;
			while(current!= null)
			{
				current.displayNode();
				current = current.next;
			}
			System.out.println(" ");
		}
		public int getSize()
		{
			System.out.println("Size of the Stack: " + size);
			System.out.println(" ");
			return size;
		}
	}
	static class Node
	{
		private Node next;
		private int item;
		
		public Node(int value)
		{
			item = value;
		}
		public void displayNode()
		{
			System.out.println(item);
		}
	}
}

