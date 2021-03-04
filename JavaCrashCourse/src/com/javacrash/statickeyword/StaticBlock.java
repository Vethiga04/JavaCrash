package com.javacrash.statickeyword;
/**
 * @author Vethiga
 *
 * 
 */
public class StaticBlock {

	static {
		System.out.println("Inside the static block1");
		Method();
	}
	
	static {
		System.out.println("Inside the static block2");
	}
	
	public static void Method(){
		System.out.println("Static Method");
	}	
	
	
	public static void main(String[] args) {
		
		System.out.println("Inside the main method");
		
	}

}
