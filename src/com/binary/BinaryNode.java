package com.binary;

public class BinaryNode<T> {
	T key;
	BinaryNode<T> left;
	BinaryNode<T> right;
	
	public BinaryNode(T key)
	{
		super();
		this.key = key;
		this.left = null;
		this.right = null;
	}
   @Override
	public String toString() 
	{
		return "BinaryNode [data=" + key + ", left=" + left + ", right=" + right + "]";
	}

}
