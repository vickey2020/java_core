package com.test.randomPgm;

import java.util.Scanner;

public class PalindromeNo {
	int rev, temp;
    int printNextPalindrome(int n) 
    {
        int num = n;
        for (int i = num+1; i >= num; i++) 
        {
            temp = i;
            rev = 0;
            while (temp != 0) 
            {
                int remainder = temp % 10;
                rev = rev * 10 + remainder;
                temp = temp / 10;
            }
            if (rev == i) 
            {
                break;
            }
        }
        return rev;
    }
    public static void main(String args[]) 
    {
        PalindromeNo np = new PalindromeNo();
        int nxtpalin = np.printNextPalindrome(789);
        System.out.println(nxtpalin);
    }

}


