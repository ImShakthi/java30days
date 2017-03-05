package com.hackerearth.java.basic;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Scanner scan = null;
		boolean isPal = true;
		try
		{
			scan = new Scanner(System.in);
			input = scan.nextLine();
			int strLen = input.length();
			int revIndex = strLen - 1 ;
			strLen = (strLen / 2) + (strLen % 2);
			for(int index = 0; index < strLen ; index++, revIndex--  )
			{
				if(input.charAt(index) != input.charAt(revIndex))
				{
					isPal = false;
					break;
				}
			}
			if(isPal)
			{
				System.out.println("YES");
			}else
			{
				System.out.println("NO");
			}
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
