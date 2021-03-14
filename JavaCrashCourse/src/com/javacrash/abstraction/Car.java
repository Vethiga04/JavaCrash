package com.javacrash.abstraction;
/**
 * @author Vethiga
 *
 * 
 */
public abstract class Car {

	public abstract void BrandName();
	
	public abstract void ManufactuerDetails(); // if a method doesn't give any implementation details, 
								//	then we can make it as abstract -> class also will change as abstract
	
	public static void Function() {
		System.out.println("Function......");
	}
	
	public static void Function2() {
		System.out.println("Function2......");
	}
	
	public static void main(String[] args) {
//		Car car=new Car(); We can't able to create an object for abstract class
	}
}
