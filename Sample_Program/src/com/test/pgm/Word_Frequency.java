package com.test.pgm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Word_Frequency {
	public static void main(String[] args) {
		String str="hi hello how are you hi hello how dear";
		String splitStr[]=str.split(" ");
		Map<String,Integer> wordCount=new HashMap();
		for(String word:splitStr)
		{
			if(wordCount.containsKey(word))
			{
				wordCount.put(word, wordCount.get(word)+1);
			}
			else
				wordCount.put(word, 1);
		}
		for(Entry<String, Integer> entry:wordCount.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
