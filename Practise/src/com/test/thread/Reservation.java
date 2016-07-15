package com.test.thread;
class Reserve implements Runnable
{
	//Available berths are 1
	int available=5;
	int wanted;
	
	// accept wanted berths at runtime
	public Reserve(int i) {
	wanted=i;
	}
	public void run()
	{
		synchronized (this) {
			
		
		// Display Available Berths
		System.out.println("Available Berths = "+available);
		if(available>=wanted)
		{
			String name=Thread.currentThread().getName();
			//allot a berth to him/her
			System.out.println(wanted+" Berth Reserved for "+name);
			try
			{
				Thread.sleep(1500);
				available=available-wanted;
			}catch(InterruptedException ie){}
		}
		else
			System.out.println("Sorry , No Berths");
		}
	}

}

public class Reservation {
	public static void main(String[] args) {
		//Tell that 1 berth is needed
		Reserve obj=new Reserve(1);
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.setName("First Person");
		t2.setName("Second Person");
		
		t1.start();
		t2.start();
		
	}

}
