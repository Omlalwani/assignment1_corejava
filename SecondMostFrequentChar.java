package com.assignment;

public class SecondMostFrequentChar {
	static final int noOfChars = 256;
	static char getSecondFrequent(String str)
	{
		int count[] = new int[noOfChars];
		for(int i=0; i<str.length(); i++)
		{
			count[str.charAt(i)]++;
		}
		
		int first = 0, second = 0;
		
		for(int i=0; i<noOfChars; i++) 
		{
			if(count[i] > count[first]) 
			{
				second = first;
				first = i;
			}
			else if((count[i] > count[second]) && (count[i] != count[first])) 
			{
				second = i;
			}
		}
		
		return (char)second;
	}	
	
	
	public static void main(String[] args) 
	{
		String str = "success";
		char result = getSecondFrequent(str);
		
		System.out.println("Second most frequent character is :- " + result);
	}
}
