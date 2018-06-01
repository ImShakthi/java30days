package com.sakthi.java.workspace;

import java.io.*;
import java.util.*;

class tree
{
	public static Hashtable h;
	public static Hashtable hKeyValue;
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int length = Integer.parseInt(br.readLine());
		String valueString = br.readLine();
			String[] lengthStrArr = valueString.split("\\s+");
			int length = Integer.parseInt(lengthStrArr[0]);
			int length3 = Integer.parseInt(lengthStrArr[1]);
		System.out.println("spk length = "+length);
		//Hashtable h = new Hashtable();
		h = new Hashtable();
		hKeyValue = new Hashtable();
		for(int i=0 ; i<length-1 ; i++)
		{
			String value = br.readLine();
			String[] splited = value.split("\\s+");
			int start = Integer.parseInt(splited[0]);
			if(!h.containsKey(start))
			{
				Hashtable ht = new Hashtable();
				ht.put(-1,new ArrayList());
				h.put(start,ht);
			}
			Hashtable arr =  (Hashtable)h.get(start);
			int end = Integer.parseInt(splited[1]);
			if(!h.containsKey(end))
			{
				Hashtable ht = new Hashtable();
				ht.put(-1,new ArrayList());
				h.put(end,ht);
			}
			//arr.a(h.get(end));
			ArrayList arrList = (ArrayList)arr.get(-1);
			arrList.add(h.get(end));
		}

		System.out.println("spk h = "+h);
		String value2 = br.readLine();
		String[] splited = value2.split("\\s+");
		for(int i=1 ; i<=splited.length ; i++)
		{
			int value = Integer.parseInt(splited[i-1]);
			Hashtable ht2 = (Hashtable)h.get(i);
			ht2.put(value ,ht2.get(-1));
			ht2.remove(-1);
			hKeyValue.put(i,value);
		}
			
		System.out.println("spk h = "+h);
		
		//int length3 = Integer.parseInt(br.readLine());
		System.out.println("spk length = "+length3);

		for(int i=0 ; i<length3 ; i++)
		{
			String value = br.readLine();
			String[] splited3 = value.split("\\s+");
		
			int tree = Integer.parseInt(splited3[0]);
			int minIndex = Integer.parseInt(splited3[1]);
			int maxIndex = Integer.parseInt(splited3[2]);
			Hashtable ht5 = new Hashtable();
			recursive((Hashtable)h.get(tree) ,ht5);
			System.out.println(ht5);
			
			Enumeration e = ht5.keys();
			Integer key = 0;
			int countAnswer = 0;
			while (e.hasMoreElements())
			{
				key = (int)e.nextElement();
				int value2Spk = (int)ht5.get(key);
				if(value2Spk >= minIndex && value2Spk <= maxIndex)
					countAnswer++;
			}
			System.out.println(countAnswer);
		}
	}
	
	public static void recursive(Hashtable ht,Hashtable ht5)
	{
		int value ;
		
		Enumeration e = ht.keys();
		Integer key = 0;
		if (e.hasMoreElements())
		{
			key = (int)e.nextElement();
		}
		
		if(ht5.containsKey(key))
		{
			int cnt = (int)ht5.get(key);
			ht5.put(key,cnt+1);
		}
		else
		{
			ht5.put(key,1);
		}
		
		ArrayList arr = (ArrayList)ht.get(key);
		for(int i=0; i<arr.size(); i++)
		{
			recursive((Hashtable)arr.get(i),ht5);
		}
	}
}