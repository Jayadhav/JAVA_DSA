package com.demo.trees;

import org.w3c.dom.Node;

public class MyBinarySearchTree
{
	Node root ;
	 class Node
	 {
		 int data;
		 Node left;
		 Node Right;
		 
		 public Node(int data)
		 {
			 this.data = data;
			 this.left= null;
			 this.Right=null;
		 } 
	 }
	 
	 public MyBinarySearchTree()
	 {
		 this.root=null;
	 }
	 
	 
	 public void insertNode(int key)
	 {
		 root = insertData(root,key);
	 }


	private Node insertData(Node root, int key) 
	{
		Node newNode = new Node(key);
		
		if (root==null)
		{
			root= newNode;
			return root;
		}
		else
		{
			if(key<root.data)
			{
				root.left=insertData(root.left,key);
			}
			else
			{
				root.Right=insertData(root.Right,key);
			}
			return root;
		}
	}
	
	
	
	public void inorder()
	{
		inorderTraversal(root);
		System.out.println();
	}


	private void inorderTraversal(Node root)
	{
		if(root!=null)
		{
			inorderTraversal(root.left);
			System.out.print(root.data+" ,");
			inorderTraversal(root.Right);
		}
		
	}
	
	
	public void preorder()
	{
		preorderTraversal(root);
		System.out.println();
	}


	private void preorderTraversal(Node root)
	
	{
		if(root!=null)
		{
		System.out.print(root.data+" ,");
		preorderTraversal(root.left);
		preorderTraversal(root.Right);
		}
		
	}
	
	public void postorder()
	{
		postorderTraversal(root);
		System.out.println();
	}


	private void postorderTraversal(Node root)
	{
		if(root!=null)
		{
		postorderTraversal(root.left);
		postorderTraversal(root.Right);
		System.out.print(root.data+" ,");
		}
	}
	
	
	public void deleteNode(int key)
	{
		root = deleteData(root,key);
	}
	
	
	public Node deleteData(Node root,int key)
	
	
	{
		if (root==null)
		{
			return root;
		}
		else
		{
			if(key<root.data)
			{
				root.left=deleteData(root.left,key);
			}
			else if(key>root.data)
			{
				root.Right=deleteData(root.Right,key);
			}
			else 
			{
				if (root.left==null  &&root.Right==null)
				{
					return null;
				}
				else if(root.left==null)
				{
					return root.Right;
				}
				else if (root.Right==null)
				{
					return root.left;
				}
				
				root.data= minvalue(root.Right);
				root.Right=deleteData(root.Right,root.data);
						
				
			}
			
		}
		return root;
	}


	private int minvalue(Node root) 
	{
		int min=root.data;
		while(root.left!=null)
		{
			min=root.left.data;
			root=root.left;
		}
		
		return min;
	}
	
	
	
	public boolean searchNode(int key)
	{
		return searchBinaryTreeRecursive(root, key);
	}


	private boolean searchBinaryTreeRecursive(Node root, int key) 
	{
		if(root != null)
		{
			if(root.data == key)
			{
				System.out.println(key+" Data Found");
				return true;
			}
			else if(key < root.data)
			{
				return searchBinaryTreeRecursive(root.left, key);
			}
			else
			{
				return searchBinaryTreeRecursive(root.Right, key);
			}
		}
		System.out.println(key+" Data not Found");
		return false;
	}
	
	
	
	
	
	
	 
	 
	 
}
