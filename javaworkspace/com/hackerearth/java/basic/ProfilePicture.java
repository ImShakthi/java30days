package com.hackerearth.java.basic;

import java.util.Scanner;

public class ProfilePicture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = null;
		try
		{
			scan = new Scanner(System.in);
			
			int frameDimension;
			int n;
			int width, height;
			
			frameDimension = scan.nextInt();
			n = scan.nextInt();

			for(int i = 0 ; i < n ; i++ )
			{
				width = scan.nextInt();
				height = scan.nextInt();
				
				if((width==frameDimension) && (height==frameDimension))
				{
					System.out.println("ACCEPTED");
				}else if((width < frameDimension) || (height < frameDimension))					
				{
					System.out.println("UPLOAD ANOTHER");
				}else
				{
					if((width==height) && (width > frameDimension) && (height > frameDimension))
					{
						System.out.println("ACCEPTED");
					}else
					{
						System.out.println("CROP IT");
					}
				}
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
