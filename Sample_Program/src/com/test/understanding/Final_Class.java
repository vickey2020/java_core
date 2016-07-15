package com.test.understanding;

class P
{
	private final int i=10;
	public void property()
	{
		System.out.println("Parent Property");
	}
	public final void marry()
	{
		System.out.println("Prachi");
	}
	public int getI() {
		return i;
	}
	/*public void setI(int i) {
		this.i = i;
	}
	*/
}
class C extends P 
{
	public void property()
	{
		System.out.println("Child Property");
	}
	
}


public class Final_Class {
	public static void main(String[] args) {
		P p=new P();
		C c=(C)new P();
	
	//	System.out.println(p.getI());
	}

}
