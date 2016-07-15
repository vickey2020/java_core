package com.test.pgm;

public class MyException {
	public static void main(String[] args) {
		String word=" "; 
		try{
			if(word.contains(" "))
			{
				
				throw new CustomizedException("my exception hello dear","number");
			}
		}catch(CustomizedException e){
			
		};
	}


}

class CustomizedException extends Exception
{


	public CustomizedException(String message,String no) {
		super();
		System.out.println(message+" "+no);
		
	}


}
