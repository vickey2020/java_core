package com.test.Map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("D:/WorkPlace/Sample_Program/src/com/test/Map/Abc.properties");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("Db");
		System.out.println(s);
		p.setProperty("Db", "Oracle");
		System.out.println(p);
		FileOutputStream fos=new FileOutputStream("D:/WorkPlace/Sample_Program/src/com/test/Map/Abc.properties");
		p.store(fos, "Updated by me");
		
	}

}
