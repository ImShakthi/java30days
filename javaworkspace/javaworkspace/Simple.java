package javaworkspace;

import java.util.Map;
import java.util.TreeMap;

public class Simple {
	public static void main(final String args[])
	{
		Map<String,Integer> primeAlphaMap = new TreeMap<String,Integer>();
		String primeChar = "C,G,I,O,S,Y,a,d,g,k,m,q";
		String primeNumber = "67,71,73,79,83,89,97,101,103,107,109,113";
		String[] primeCharArray = primeChar.split(",");
		String[] primeNumberArray = primeNumber.split(",");
		for(int index = 0, len =  primeCharArray.length ; index < len ; index++ )
		{
			primeAlphaMap.put(primeCharArray[index], Integer.parseInt(primeNumberArray[index]));
		}
		for( String key : primeAlphaMap.keySet())
		{
			System.out.println(key + " - " + primeAlphaMap.get(key));
		}
	}
}
