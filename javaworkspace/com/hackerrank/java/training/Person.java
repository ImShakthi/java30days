package com.hackerrank.java.training;

import java.util.Scanner;

/**
 * @author sakthivel
 */
public class Person {

    private int age;

    public Person() {
    }

    /**
     * public constructor for the ClassAndInstance
     */
    public Person(final int initialAge) {
	if (initialAge >= 0) {
	    this.age = initialAge;
	} else {
	    this.age = 0;
	    System.out.println("Age is not valid, setting age to 0..");
	}
    }

    /**
     * Method to get age
     * 
     * @return age
     */
    public int getAge() {
	return age;
    }

    /**
     * Method to set age
     * 
     * @param ageArg
     */
    public void setAge(final int ageArg) {
	this.age = ageArg;
    }

    public void amIOld() {
	    if (this.getAge() < 13) {
		System.out.println("You are young.. ");
	    } else if (this.getAge() >= 13 && this.getAge() < 18) {
		System.out.println("You are a teenager.. ");
	    } else {
		System.out.println("You are old..");
	    }
    }

    public void yearPasses() {
	// Increment this person's age.
	this.setAge(this.getAge()+1);
    }

    /**
     * Main method
     * 
     * @param args
     */
    public static void main(final String[] args) {
	// TODO Auto-generated method stub
	int numberOfInputs;
	int age;
	Scanner scan = new Scanner(System.in);
	try {
	    Person object;
	    System.out.println("Enter the number of inputs :: ");
	    numberOfInputs = scan.nextInt();
	    for (int i = 0; i < numberOfInputs; i++) {
		System.out.println("Enter the age :: ");
		age = scan.nextInt();
		object = new Person(age);
		for (int counter = 0; counter < 2; counter++) {
		    object.amIOld();
		    object.yearPasses();
		}
		System.out.println("");
	    }
	} catch (Exception e) {
	    System.out.println("Error caused due to " + e);
	} finally {
	    try {
		scan.close();
	    } catch (Exception e) {
		System.out.println("Error caused while closing scanner connection due to " + e);
	    }
	}
    }
}
