package com.collection;

public class OwnAL {
	public static void main(String[] args) {
		
	}

}

class ArrayList
{
	private Object element[];
	private int capacity;
	private int size;
	
	public ArrayList()
	{
		capacity=10;
		element=new Object[capacity];
	}
	
	public void add(Object obj)
	{
		if(capacity==size)
		{
			alterCapacity();
		}
		element[size++]=obj;
	}
		public void alterCapacity()
		{
			capacity=capacity*2;
			Object temp[]=element;
			element=new Object[capacity];
			for(int i=0;i<temp.length;i++)
			{
				element[i]=temp[i];
			}
		}

}
