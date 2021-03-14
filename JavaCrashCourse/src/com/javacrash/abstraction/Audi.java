package com.javacrash.abstraction;
/**
 * @author Vethiga
 *
 * 
 */
public class Audi extends Car implements UpcomingProject,Interface2 { // Inheritance Used
	 // can implements multiple interfaces
	
	@Override
	public void BrandName() {
		System.out.println("BrandName is Audi");
	}

	@Override
	public void ManufactuerDetails() {
		System.out.println("It has audi manufacturer");
	}
	
	
	public static void main(String[] args) {
		Car car=new Audi(); // Dynamic polymorphism used
		car.BrandName();
		car.ManufactuerDetails();
	}

	@Override
	public void EmployeeDetails() {
		// TODO Auto-generated method stub
		
	}


}
