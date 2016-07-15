package com.test.thread;

class MyThread1 implements Runnable
{
	String str;
	public MyThread1(String str) {
		this.str=str;
	}
	public void run()
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.println(str+" : "+i);
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException ie){ ie.printStackTrace();}
		}
		
	}
}

public class MyThread  {
	public static void main(String[] args) {

		MyThread1 t1=new MyThread1("Cut the Ticket");
		MyThread1 t2=new MyThread1("Show the Ticket");
		Thread tt1=new Thread(t1);
		Thread tt2=new Thread(t2);
		tt1.start();
		tt2.start();
	}


}
