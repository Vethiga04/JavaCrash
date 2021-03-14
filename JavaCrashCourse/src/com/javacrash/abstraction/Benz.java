package com.javacrash.abstraction;
/**
 * @author Vethiga
 *
 * 
 */
public class Benz extends Car {

	@Override
	public void BrandName() {
		System.out.println("BrandName is Benz");
	}

	@Override
	public void ManufactuerDetails() {
		System.out.println("It has benz manufacturer");
	}

	public static void main(String[] args) {
		Car car=new Benz();
		car.BrandName();
		car.ManufactuerDetails();
	}

}
