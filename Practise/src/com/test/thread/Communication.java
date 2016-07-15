package com.test.thread;
class Producer extends Thread
{
	StringBuffer sb;
	Boolean dataProdOver=false;
	public Producer() {
	sb=new StringBuffer();
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			
			try
			{
				sb.append(i+":");
				sleep(150);
				System.out.println("Appending ");
			}catch(InterruptedException ie){}
		}
		dataProdOver=true;
		
	}
	
}
class Consumer extends Thread
{
	Producer pd;
	public Consumer(Producer pd) {
		// TODO Auto-generated constructor stub
		this.pd=pd;
	}
	public void run(){
		try{
		while(!pd.dataProdOver)
		
			Thread.sleep(100);
		}
		catch (Exception e) {}
		System.out.println(pd.sb);
		
	}

}



public class Communication {
public static void main(String[] args) {
	Producer pd=new Producer();
	Consumer cs=new Consumer(pd);
	Thread t1=new Thread(pd);
	Thread t2=new Thread(cs);
	t2.start();
	t1.start();
}
}
