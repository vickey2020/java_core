package com.test.thread;

public class Example {
	public static void main(String[] args) {
		System.out.println("Let us find current thread");
		Thread t=Thread.currentThread();
		System.out.println("Current Thread= "+t+"\n Name: "+t.getName());
	}

}
