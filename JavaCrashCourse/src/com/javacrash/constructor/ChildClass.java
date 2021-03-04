package com.javacrash.constructor;
/**
 * @author Vethiga
 *
 * 
 */
public class ChildClass extends ParentClass{  //  parentClass properties get acquire by childClass

	public ChildClass() {
		// TODO Auto-generated constructor stub
//		super(); It's hidden element in the constructor
		System.out.println("Child class constructor");
	}
	
	public static void main(String[] args) {
		
		ChildClass childClass=new ChildClass();

		
	}
	
}
