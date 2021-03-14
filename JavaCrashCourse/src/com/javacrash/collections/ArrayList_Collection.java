package com.javacrash.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Vethiga
 *
 * 
 */
public class ArrayList_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> arrayList=new ArrayList<String>();
		arrayList.add("Audi");
		arrayList.add("Benz");
		arrayList.add("BMW");
		arrayList.add("Buick");
		arrayList.add("Buick");
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.indexOf("Buick"));
		System.out.println(arrayList.lastIndexOf("Buick")); // if the element is not available, then result will be -1
		
		List<String> anotherarrayList=new ArrayList<String>();
		
		anotherarrayList.addAll(arrayList); // to add all elements from a different array 
		System.out.println(anotherarrayList);
		
		anotherarrayList.clear();  // to clear all elements of array
		System.out.println(anotherarrayList);
		
		arrayList.remove(3); // remove element using index
		System.out.println(arrayList);
		
		arrayList.remove("BMW"); // remove element using element value
		System.out.println(arrayList);
		
		arrayList.add(null); // to add null into array
		System.out.println(arrayList);
		
		arrayList.set(3, "Bugati"); // to update an element with desired position
		System.out.println(arrayList);
		
		System.out.println(arrayList.isEmpty()); // to verify whether the array is empty or not
		
		for(String element:arrayList) {
			System.out.println("Using for each: "+element);
		}
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println("Using for loop: "+arrayList.get(i));
		}
		
		System.out.println("-------------------------------------------------");
		
		ListIterator<String> listIterator=arrayList.listIterator(); // in ListIterator backward and forward
												//	 direction is possible
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("-------------------------------------------------");
		
		while(listIterator.hasPrevious()) {// in ListIterator backward and forward
								//	 direction is possible
			
			System.out.println(listIterator.previous());
		}
		
		System.out.println("-------------------------------------------------");

		Iterator<String> iterator=arrayList.iterator(); // only forward direction is possible
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
