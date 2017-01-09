package com.hackerearth.java.basic;

import java.util.Scanner;

public class ToggleString {

	public static void main(String args[]) throws Exception {
		// Scanner
		Scanner scan = null;
		try {

			scan = new Scanner(System.in);
			// int N = s.nextInt();
			String input = scan.nextLine();
			StringBuilder inputBuffer = new StringBuilder(input);
			String temp = "";
			String upperBuffer = "";
			String lowerBuffer = "";
			int strLen = input.length();
			char ch;
			for (int index = 0; index < strLen; index++) {
				temp = "" + inputBuffer.charAt(index);
				upperBuffer = temp.toUpperCase();
				lowerBuffer = temp.toLowerCase();
				if (temp.equals(upperBuffer)) {
					upperBuffer = upperBuffer.toLowerCase();
					ch = upperBuffer.charAt(0);
					inputBuffer.setCharAt(index, ch);
				} else if (temp.equals(lowerBuffer)) {
					ch = upperBuffer.charAt(0);
					inputBuffer.setCharAt(index, ch);
				} else {
					ch = temp.charAt(0);
					inputBuffer.setCharAt(index, ch);
				}
			}
			System.out.println(inputBuffer);
		} catch (Exception e) {

		} finally {
			scan.close();
		}
	}
}
