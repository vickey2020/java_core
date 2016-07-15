package com.test.string;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Word_Swap {
	public static void main(String[] args) {
		String str="my name is hello hi hi navneet hello my is hi lot lot is hi";
		String splitWord[]=str.split(" ");
		//List<String> al=Arrays.asList(word);
		Map<String, Integer> wordCount=new HashMap<String, Integer>();
		for(String word:splitWord)
		{
			System.out.println(wordCount.get(word));
			if(wordCount.containsKey(word))
			{
				wordCount.put(word,wordCount.get(word)+1);
			}
			else
				wordCount.put(word, 1);
		}
		for(java.util.Map.Entry<String, Integer> entry : wordCount.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}

}
