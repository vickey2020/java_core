package com.test.Map;

import java.util.HashMap;
import java.util.WeakHashMap;
class Temp
{
	public String toString() {
		return "temp";
		
	}
	public void finalize() {
		System.out.println("finalize mathod call");
		
	}
}


public class WeakHM {
	public static void main(String[] args) throws InterruptedException {
		WeakHashMap map=new WeakHashMap<>();
		Temp t=new Temp();
		map.put(t, "raman");
		//map.put(t, "singh");
		t=null;
		System.gc();
		//Thread.sleep(1000);
		System.out.println(map);
	}

}
