package com.example.java;

public class Stack<T> {
	
	int arr[] = new int[10];
	
	static int count = 0;
	
	public void push(int element)
	{
		if(count < 10)
		{
			arr[count++] = element;
		}
		else
		{
			System.out.println("Array is full");
		}
		
	}
	
	public void pop()
	{
		if(count > 0)
		{
			arr[--count] = 0;
		}
		else
		{
			System.out.println("Array is empty");
		}
	}
	
	public void traverse()
	{
		for(int i=0; i< count; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
