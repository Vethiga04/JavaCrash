package com.javacrash.statickeyword;
/**
 * @author Vethiga
 *
 * 
 */
public class StaticMethod {

	public static void Method(){
		System.out.println("Static Method");
	}	
	
	
	public void NonStatic() {
		Method();
		System.out.println("Non Static Method");
	}
	
	public static void main(String[] args) {
		Method();
	}

}
