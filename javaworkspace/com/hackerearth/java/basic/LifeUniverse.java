package com.hackerearth.java.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class LifeUniverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = null;
		try
		{
			scan = new Scanner(System.in);
			int number;
			ArrayList<Integer> numberList = new ArrayList<Integer>();
			
			do
			{
				number = scan.nextInt();
				if(number == 42)
				{
					break;
				}
				numberList.add(number);
			}while(true);
			
			for(int index = 0, len = numberList.size(); index < len ; index++ )
			{
				System.out.println(numberList.get(index));
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
