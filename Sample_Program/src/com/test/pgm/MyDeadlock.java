package com.test.pgm;

public class MyDeadlock {
	String str1="Java";
	String str2="Unix";
	Thread t1=new Thread(){
		public void run()
		{
			while(true)
			{
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(str1 + str2);
					}
					
				}
			}
		}
		
	};
	
	Thread t2=new Thread(){
		public void run()
		{
			synchronized (str1) {
				synchronized (str2) {
					System.out.println(str2 + str1);
				}
			}
		}
		
	};
	public static void main(String[] args) {
		MyDeadlock md=new MyDeadlock();
		md.t1.start();
		md.t2.start();
	}
	
	

}
