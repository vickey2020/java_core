package com.test.randomPgm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LengthOfAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        String str[]=new String[length];
        for(int i=0;i<length;i++)
        {
        	 str[i]=sc.next();
        }
        HashMap<String, Integer> map=new HashMap<>();

        
        for(String temp : str ){
        	char [] t1 = temp.toCharArray();
        	Arrays.sort(t1);
        	String t2 = String.valueOf(t1);
        	
        	if(map.containsKey(t2)){
        		map.put(t2,map.get(t2)+1);
        	}
        	else{
        		map.put(t2,1);
        	}
        }
        
        int result = 0;
        
        for(Integer v : map.values()){
        	if(v > result)
        		result = v;
        }
        
        System.out.println(result);
    }    
}
