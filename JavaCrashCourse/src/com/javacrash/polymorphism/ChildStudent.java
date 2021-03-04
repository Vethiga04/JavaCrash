package com.javacrash.polymorphism;


/**
 * @author Vethiga
 *
 * 
 */
public class ChildStudent extends ParentDivision {

	/*
	 *	This class is to illustrate method overriding
	 *  with practical example
	 */

	@Override
	public void ComeEarly() {
		System.out.println("I'll to come to school by 7 am..");
	}

	public static void main(String[] args) throws Exception {

		ParentDivision parentDivision=new ChildStudent(); // ParentClass ref=new ChildClass();
		parentDivision.DoHomeWork();
		parentDivision.ComeEarly();

	}

}
