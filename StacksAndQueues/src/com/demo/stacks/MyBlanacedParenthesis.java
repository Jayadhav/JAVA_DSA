package com.demo.stacks;

public class MyBlanacedParenthesis<T>
{
	Node top;
	class Node{
		T data;
		Node next;
		public Node(T data) {
			this.data = data;
			this.next=null;
		}
		
	}
	
	
	
	public MyBlanacedParenthesis()
	{
		top=null;
	}
	
	
	public boolean isEmpty()
	{
		return top==null;
	}
	
	
	public void push(T num)
	{
		Node newNode = new Node(num);
		
	}
	
}
