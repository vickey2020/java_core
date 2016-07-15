package com.test.string;

public class Duplicate_Character {
	public static void main(String[] args) {
		String str="Hello to all";
		char[] ch=new char[str.length()];
		int count;
		ch=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			count=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j] )
				{
					++count;
					ch[j]='\0';
				}
			}
			if(ch[i]!='\0' && ch[i]!=' ')
				System.out.print(ch[i]+":"+count+"  ");
		}
	}

}
