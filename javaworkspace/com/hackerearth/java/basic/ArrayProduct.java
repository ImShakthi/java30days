package com.hackerearth.java.basic;

import java.math.BigInteger;
//import java.util.ArrayList;
import java.util.Scanner;

public class ArrayProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Integer number;
		
		BigInteger product = new BigInteger("1");
		BigInteger power10 = new BigInteger("1000000007");

		Scanner scan = null;
		try
		{
			scan = new Scanner(System.in);
			n = scan.nextInt();
			for(int index = 0 ; index < n ; index++ )
			{
				number = scan.nextInt();
				BigInteger temp = new BigInteger(number.toString());
				product = product.multiply(temp);
				product = product.mod(power10);
			}
			System.out.println(product);
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
