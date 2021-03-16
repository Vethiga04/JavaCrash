package com.javacrash.collections;

import java.util.Set;

/**
 * @author Vethiga
 *
 * 
 */
public class LinkedHashSet {

	/**
	 * LinkedHashSet->Child class of HashSet
	 * DS-> Hash table + Linked List
	 * Insertion order is preserved
	 * Duplicates not allowed
	 */

	public void linkedHashSetExample(){
		java.util.LinkedHashSet linkedHashSet=new java.util.LinkedHashSet();
		linkedHashSet.add(1);
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("10");
		linkedHashSet.remove("10");

		System.out.println("Insertion Order preserved Linked Hash Set :"+ linkedHashSet);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet example= new LinkedHashSet();
		example.linkedHashSetExample();
	}

	
}
