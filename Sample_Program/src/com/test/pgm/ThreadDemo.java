package com.test.pgm;

class MyRunnable implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
			System.out.print(i);
		
	}
	
}

public class ThreadDemo {
public static void main(String[] args) {
	MyRunnable r=new MyRunnable();
	Thread t=new Thread(r);
	t.start();
	System.out.println("main()");
}
}
