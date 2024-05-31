package com.apica.assignment.assignment1_gc;

public class Example {
	
	public static void main(String[] args) throws InterruptedException {

		Example e1 = new Example();
		Example e2 = new Example();
		Example e3 = new Example();

		e3 = e1; 
		e1 = e2; 
		e2 = null; 
		e3 = e1;
		
		int objectsEligibleForGC = 2;

		System.out.println("At this line " + objectsEligibleForGC + " object(s) eligible for GC");
	}

}
