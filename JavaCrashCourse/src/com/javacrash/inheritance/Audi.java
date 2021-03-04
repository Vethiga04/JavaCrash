package com.javacrash.inheritance;
/**
 * @author Vethiga
 *
 * 
 */
public class Audi extends Car{

	public static void main(String[] args) {

		Audi audi=new Audi();
		audi.CarWheel_1();
		audi.CarWheel_2();
//		audi.CarWheel_3(); cannot be used bcoz its private method
		audi.CarWheel_4();
		
	}

}
