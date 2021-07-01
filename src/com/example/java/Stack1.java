package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Stack1<T> {

	List<T> list = new ArrayList<T>();
	
	public void push(T element)
	{
		list.add(element);
	}
	
	public void pop()
	{
		if(list.size() > 0)
		{
			list.remove(list.size()-1);
		}
		else
		{
			System.out.println("List is empty");
		}
	}
	
	public void traverse()
	{
		list.forEach(System.out::println);
	}
}
