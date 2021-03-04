package com.javacrash.constructor;
/**
 * @author Vethiga
 *
 * 
 */
public class Vi04_2_Employee {

	int EmployeeID;
	String Employee_Name;
//	It's user defined constructor
//	Define a constructor(no argument constructor/non parameterized constructors) - class name and constructor name should be same
	Vi04_2_Employee() {
		// TODO Auto-generated constructor stub
		EmployeeID=0001;
		Employee_Name="Vethiga";
		System.out.println("Employee object is created");
	}
	
	
	public static void main(String[] args) { // arguments or parameters  parsing within the method called as arguments or parameters
		// TODO Auto-generated method stub
//		Creating Object for Employee_Vi05 class
		Vi04_2_Employee employee=new Vi04_2_Employee();
	}

}
