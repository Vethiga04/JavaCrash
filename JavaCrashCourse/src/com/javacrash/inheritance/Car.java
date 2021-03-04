package com.javacrash.inheritance;
/**
 * @author Vethiga
 *
 * 
 */
public class Car {

	protected int wheel_1=4;
	public int wheel_2=4;
	private int wheel_3=4;
	int wheel_4=4;

	protected void CarWheel_1() {
		System.out.println(" Wheels count from CarWheel_1 method : "+wheel_1);
	}

	public void CarWheel_2() {
		System.out.println(" Wheels count from CarWheel_2 method : "+wheel_2);
	}

	private void CarWheel_3() {
		System.out.println(" Wheels count from CarWheel_3 method : "+wheel_3);
	}

	void CarWheel_4() {
		System.out.println(" Wheels count from CarWheel_4 method : "+wheel_4);
	}
}
