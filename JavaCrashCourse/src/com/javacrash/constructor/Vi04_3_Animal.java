package com.javacrash.constructor;
/**
 * @author Vethiga
 *
 * 
 */
public class Vi04_3_Animal {

	String AnimalName;
	int AnimalType;
	// It's user defined constructor
	// Parameterized constructor 
	
	 Vi04_3_Animal(String name,int type) {
		// TODO Auto-generated constructor stub
		 
		 this.AnimalType=type; // this. means populate the child object's value ------- super. means populate the parent object's value
		 this.AnimalName=name;
		 
	}
	
	 public void GetAnimalInfo() {
		 System.out.println("Animal name is "+AnimalName+" and Animal type is "+AnimalType);
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vi04_3_Animal animal1=new Vi04_3_Animal("Dog", 129); // object creation
		animal1.GetAnimalInfo();
	
		Vi04_3_Animal animal2=new Vi04_3_Animal("Cat", 120);
		animal2.GetAnimalInfo();
	}

}
