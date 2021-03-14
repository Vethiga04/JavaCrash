package com.javacrash.string;
/**
 * @author Vethiga
 *
 * 
 */
public class StringMethods {

	
	public static void main(String[] args) {

		String UserName="VeniSemolina";
		String StringWithSpace=" Good Morning ";
		int Number=123;
		
		System.out.println(UserName.charAt(3)); // returns character value for particular index
		
		System.out.println(UserName.equals("Vethiga")); // check the equality of string with given object
		
		System.out.println(UserName.equalsIgnoreCase("VENISemOlINa"));// check the equality of string with given object without case sensitivity
		
		System.out.println(UserName.contains("v")); // returns true/false based on given value is present or not
		
		System.out.println(UserName.length()); // returns string length
		
		System.out.println(UserName.isEmpty()); // checks string is empty or not
	
		System.out.println(UserName.substring(2)); // take a particular portion of string
		
		System.out.println(UserName.substring(4, 8)); // take a particular portion of string begin and end index
		
		System.out.println(UserName.concat("Vethiga")); // appends the string to given string
		
		System.out.println(UserName.replace("Veni", "Vethi")); // replaces the existing char with given char
		
		System.out.println(UserName.indexOf("S")); // find a position of character in string

		System.out.println(UserName.indexOf("Se", 0)); // find the character specified from the index position
		
		System.out.println(UserName.indexOf('i',0)); // find the character specified from the index position
		
		System.out.println(StringWithSpace.trim()); // trim will remove the white spaces before and after(not the middle spaces)
		
		System.out.println(String.valueOf(Number)); // convert the given data type to string
		
		String UpperCase="VETHIGA";
		String LowerCase="vethiga";
		System.out.println(UpperCase.toLowerCase());
		System.out.println(LowerCase.toUpperCase());
		
		System.out.println(String.join("/", "02","10","2021")); // returns a joined string with given delimiter
		
		String SplitText="Name ID Details DOB"; // split
		String[] SplitToWords=SplitText.split(" ");
		for (String string : SplitToWords) {
			System.out.println(string);
		}
		
		
	}
	

}
