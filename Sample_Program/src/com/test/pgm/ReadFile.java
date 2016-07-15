package com.test.pgm;

import static java.lang.System.out;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws Exception {
		
		/*String ss = new String(readAllBytes(get("E:\\testing.txt")));
		//out.println(ss);
		
		
		String[] words = ss.split(" ");

        for (String word : words) {
          if (word.equals("hello")) 
          {
			out.println("hello");

		} else if (word.equals("hi")) {
			out.println("hi");

		} else if (ss.contains("jj")) {
			out.println("jj");

		}
        else {
			out.println("sting does not match with given operation ");

		}
*/	
	
		
		
		
		double count = 0,countBuffer=0,countLine=0;
	    String lineNumber = "";
	    String filePath = "E:\\testing.txt";
	    BufferedReader br;
	    String inputSearch = "are";
	    String line = "";

	    try {
	        br = new BufferedReader(new FileReader(filePath));
	        try {
	            while((line = br.readLine()) != null)
	            {
	                countLine++;
	                //System.out.println(line);
	                String[] words = line.split(" ");

	                for (String word : words) {
	                  if (word.equals("hello")) {
	                	  System.out.println("hello" +"   "+count++);
	                    
	                    countBuffer++;
	                  }
	                  if (word.equals("hi")) {
	                	  System.out.println("hi" +"   "+count++);
	                    
	                    countBuffer++;
	                  }
	                }

	                /*if(countBuffer > 0)
	                {
	                    countBuffer = 0;
	                    lineNumber += countLine + ",";
	                }*/

	            }
	            br.close();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    } catch (FileNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }

	    
	}
	}
	
        

