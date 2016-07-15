package com.test.pgm;

import org.omg.Messaging.SyncScopeHelper;

abstract class Vechile1
{
	public abstract int getNoOfWheels();
}

class Bus extends Vechile1
{
	public int getNoOfWheels()
	{
		return 6;
	}
}
class Auto extends Vechile1
{
	public int getNoOfWheels()
	{
		return 3;
	}
}
public class Vechile {
	public static void main(String[] args) {
	Auto a=new Auto();
	System.out.println(a.getNoOfWheels());
	}
	
	

}
