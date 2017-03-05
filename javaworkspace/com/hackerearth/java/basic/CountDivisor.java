package com.hackerearth.java.basic;

import java.util.Scanner;

public class CountDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = null;
		try
		{
			int startRange, endRange;
			int divisor, counter = 0;
			
			scan = new Scanner(System.in);
			
			startRange = scan.nextInt();
			endRange = scan.nextInt();
			divisor = scan.nextInt();
			
			while(startRange <= endRange)
			{
				if((startRange % divisor) == 0 )
				{ 
					counter++;
				}
				startRange++;
			}
			System.out.println(counter);
		}
		catch(Exception e)
		{
			System.out.println("Error caused due to " + e);
		}
		finally
		{
			scan.close();
		}
	}

}
