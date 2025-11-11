package com.list.test;

import com.linked.list.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) 
	{
		
		DoublyLinkedList ob =new DoublyLinkedList();
		
		ob.addNode(10);
		ob.addNode(100);
		ob.addNode(1000);
		ob.addNode(10000);
		ob.addNode(100000);
		ob.addNode(1000000);
		ob.Display();
		ob.addByPos(2, 200);
		ob.Display();
		ob.addAfterValue(10, 400);
		ob.Display();
		
	}

}
