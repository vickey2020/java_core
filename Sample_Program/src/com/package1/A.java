package com.package1;

import java.io.InputStreamReader;

public class A {
void a()
{
	System.out.println("sdsdsd");
}
	public static void main(String[] args) {
		int x=1,y=10,z=1,k=1;
		A a1=new A();
		a1.a();
		do{
			y--;
			x++;
			y-=2;
			y=z;
			z++;
			System.out.println(k++);
		}while(y>1&&z<10);
	}

}


