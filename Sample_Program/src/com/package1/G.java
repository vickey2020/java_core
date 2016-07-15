package com.package1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class G {
	public static void main(String[] args) {
		String str="abc@ng.com;xyz@ng.com;mnp@ng.com";
		int[] arr={10,20,30,40};
		ArrayList list=new ArrayList();
		String s[]=new String[3];
		s=str.split(";");
		for(String i:s)
		{
			list.add(i);
		}
		for(int i:arr)
		{
			list.add(i);
		}
		
		System.out.println(list);
	}

}
