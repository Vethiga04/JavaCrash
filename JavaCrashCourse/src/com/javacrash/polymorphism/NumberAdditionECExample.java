package com.javacrash.polymorphism;
/**
 * @author Vethiga
 *
 * 
 */
public class NumberAdditionECExample {

	//    Method overloading example
	
	/*
	 *	This class is to illustrate method overloading
	 *  with practical example
	 */


	int Addition(int a, int b) {
		return (a+b);
	}

	float Addition(int a, float b) {
		return (a+b);
	}

	float Addition(float a, float b, float c) {
		return (a+b+c);
	}

	public float Addition(int a, float b, int c) {
		System.out.println("Sum of a, b and c: "+(a+b+c));
		return (a+b+c);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberAdditionECExample numberAddition=new NumberAdditionECExample();
		System.out.println(numberAddition.Addition(45, 73));
		System.out.println(numberAddition.Addition(4, 1.12341f));
		System.out.println(numberAddition.Addition(0.34f, 4.08f,5.2028f));
		System.out.println(numberAddition.Addition(4,2.028f ,9)); // we can't use println, when we have the return type as void


	}

}
