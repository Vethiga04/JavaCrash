package com.javacrash.stringBuffer;
/**
 * @author Vethiga
 *
 * 
 */
public class StringBuffer {

	public static void main(String[] args) {

		String Name="Veena";
		
		System.out.println("Example for String");
		System.out.println("Appending Name is: "+Name.concat("Vethiga"));
		System.out.println("Original Name is: " +Name);

		System.out.println("---------------------------------");
		
		java.lang.StringBuffer buffer=new java.lang.StringBuffer("Veena");
		System.out.println("Example for StringBuffer");
		System.out.println("Appending Name is: "+buffer.append("Vethiga"));
		System.out.println("Original Name is: "+buffer);
		
		System.out.println("--------------------------------------------");

		StringBuilder builder=new StringBuilder("Veena");
		System.out.println("Example for StringBuilder");
		System.out.println("Appending Name is: "+builder.append("Vethiga"));
		System.out.println("Original Name is: "+builder);
	}

}
