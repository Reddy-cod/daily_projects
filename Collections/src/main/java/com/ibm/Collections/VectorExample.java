package com.ibm.Collections;

import java.util.Vector;
import java.util.Enumeration;

public class VectorExample {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>(3, 2);
		System.out.println("Initial size: " + v.size());
		System.out.println("Initial capacity: " + v.capacity());
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		System.out.println("Capacity after four additions: " + v.capacity());
		v.addElement(5);
		System.out.println("Current capacity: " + v.capacity());
		v.addElement(6);
		v.addElement(7);
		System.out.println("Current capacity: " + v.capacity());
		v.addElement(9);
		v.addElement(10);
		System.out.println("Current capacity: " + v.capacity());
		v.addElement(11);
		v.addElement(12);
		System.out.println("First element: " + v.firstElement());
		System.out.println("Last element: " + v.lastElement());
		if (v.contains(3))
			System.out.println("Collection contains 3.");
		Enumeration<Integer> vE = v.elements();
		System.out.println("\nElements in collection:");
		while (vE.hasMoreElements())
			System.out.print(vE.nextElement() + " ");
		System.out.println();
	}
}
