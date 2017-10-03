package com.hackerrank.java.code30.days;

import java.util.Scanner;

/**
 * 
 * @author sakthivel
 *
 */

/**
 * <b>Task</b> Complete the code in the editor below. The variables , , and are
 * already declared and initialized for you. You must:
 * <P>
 * <b>Declare variables: </b>one of type int, one of type double, and one of
 * type String. Read lines of input from stdin (according to the sequence given
 * in the Input Format section below) and initialize your variables. Use the
 * operator to perform the following operations: Print the sum of plus your int
 * variable on a new line. Print the sum of plus your double variable to a scale
 * of one decimal place on a new line. Concatenate with the string you read as
 * input and print the result on a new line.
 * <P>
 * <b>Note:</b> If you are using a language that doesn't support using for
 * string concatenation (e.g.: C), you can just print one variable immediately
 * following the other on the same line. The string provided in your editor must
 * be printed first, immediately followed by the string you read as input.
 * <P>
 * <b>Input Format</b> The first line contains an integer that you must sum with
 * . The second line contains a double that you must sum with . The third line
 * contains a string that you must concatenate with .
 * <P>
 * <b>Output Format</b> Print the sum of both integers on the first line, the
 * sum of both doubles (scaled to decimal place) on the second line, and then
 * the two concatenated strings on the third line.
 * <P>
 * <b>Sample Input</b> 12 4.0 is the best place to learn and practice coding!
 * <P>
 * <b>Sample Output</b> 16 8.0 HackerRank is the best place to learn and
 * practice coding!
 * <P>
 * <b>Explanation</b> When we sum the integers and , we get the integer . When
 * we sum the floating-point numbers and , we get . When we concatenate
 * HackerRank with is the best place to learn and practice coding!, we get
 * HackerRank is the best place to learn and practice coding!.
 * <P>
 */

public class Day01DataTypes {

    public static void main(String[] args) {
	int i = 4;
	double d = 4.0;
	String s = "HackerRank ";
	Scanner scan = null;
	try {

	    scan = new Scanner(System.in);
	    /* Declare second integer, double, and String variables. */
	    int u_int;
	    double u_double;
	    String u_str;
	    /* Read and save an integer, double, and String to your variables. */
	    u_int = scan.nextInt();
	    u_double = scan.nextDouble();
	    scan.nextLine();
	    u_str = scan.nextLine();
	    /* Print the sum of both integer variables on a new line. */
	    u_int = u_int + i;
	    u_double = u_double + d;
	    u_str = s + u_str;
	    /* Print the sum of the double variables on a new line. */
	    System.out.println(u_int);
	    System.out.println(u_double);
	    System.out.println(u_str);
	    /*
	     * Concatenate and print the String variables on a new line; the 's' variable
	     * above should be printed first.
	     */
	} catch (Exception e) {
	    System.err.println("@@Error caused due to " + e);
	} finally {
	    if (scan != null) {
		scan.close();
	    }
	}
    }
}
