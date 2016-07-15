package com.test.pgm;

public class SecondHighest {
public static void main(String[] args) {
	int arr[]={12,44,55,4,99,88,96,108,200};
	int largest=arr[0];
	int secondLargest=arr[0];
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>largest)
		{
			secondLargest=largest;
			largest=arr[i];
		}
		else if(arr[i]>secondLargest)
			secondLargest=arr[i];
	}
	System.out.println();
	System.out.println(secondLargest);
	
}
}
