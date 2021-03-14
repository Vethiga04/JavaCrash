package com.javacrash.abstraction;
/**
 * @author Vethiga
 *
 * 
 */
public interface UpcomingProject extends Interface2,Interface1 {  // can extends multiple interfaces

	String EmployeeName="Vethiga";  // variables- by default public,static,final
	
	void EmployeeDetails(); // methods- by default public/abstract

	// we couldn't be able to create an object - doesn't have any implementation within methods
	
	
}
