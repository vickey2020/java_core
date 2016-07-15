package com.test.thread;
class BookTicket extends Thread
{
	Object train,compartment;
	public BookTicket(Object train,Object compartment) {
		this.train=train;
		this.compartment=compartment;
		}
	public void run()
	{
		synchronized (train) {
			System.out.println("Book ticket locked on compartment");
			try
			{
				sleep(150);
			}catch(InterruptedException ie){}
			System.out.println("Book ticket now waiting to lock on compartment");
			synchronized (compartment) {
				
				System.out.println("Book ticket locked on Compartment ");
			}
			
		}
	}
}
class CancelTicket extends Thread
{
	Object train,compartment;
	public CancelTicket(Object train,Object compartment) {
	this.train=train;
	this.compartment=compartment;
	}
	
	public void run() {
		synchronized (train) {
			System.out.println("Cancel Ticket");
			try
			{
				sleep(200);
			}catch(InterruptedException ie){}
			System.out.println("Cancel ticket now waiting to lock on compartment");
			synchronized (compartment) {
				System.out.println("Lock train");
			}
		}
	
		
	}

}



public class DeadLock {
	public static void main(String[] args) {
		Object train=new Object();
		Object compartment=new Object();
		BookTicket obj1=new BookTicket(train, compartment);
		CancelTicket obj2=new CancelTicket(train, compartment);
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();
	}

}
