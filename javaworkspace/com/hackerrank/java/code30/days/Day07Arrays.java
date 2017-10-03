package com.hackerrank.java.code30.days;

import java.util.Scanner;

public class Day07Arrays {

    public static void main(String[] args) {
	Scanner in = null;
	try {
	    in = new Scanner(System.in);
	    int n = in.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
		arr[i] = in.nextInt();
	    }
	    int len = arr.length - 1;
	    for (; len > -1; len--) {
		System.out.print(arr[len] + " ");
	    }
	} catch (Exception e) {
	    System.err.println("@@Error " + e);
	} finally {
	    if (in != null) {
		in.close();
	    }
	}
    }
}
