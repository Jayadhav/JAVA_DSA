package com.demo.test;

import com.demo.stacks.MyStackList;

public class TestMyStackList {

	public static void main(String[] args) 
	{
		MyStackList ob = new MyStackList();
		ob.push(23);
		ob.push(22);
		ob.push(20);
		ob.push(7);
		ob.push(3);
		ob.push(1);
		ob.push(2);
		ob.push(244);
		ob.push(333);
		ob.push(7);
		ob.push(1111);
		ob.push(88);
		
		System.out.println(" ---------------");
		
		System.out.println("popped : "+ob.pop());
		System.out.println("popped : "+ob.pop());
		System.out.println("popped : "+ob.pop());
		System.out.println("popped : "+ob.pop());
		System.out.println("popped : "+ob.pop());
		System.out.println("popped : "+ob.pop());


	}

}
