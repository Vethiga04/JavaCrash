package com.javacrash.exceptionhandling;

import java.util.Scanner;

/**
 * @author Vethiga
 *
 * 
 */
public class ExceptionHandling {

	public static void main(String[] args) throws Exception {

		Scanner sc=null;

		/////////////////////////////////////////////////////////////////////////
		// catch block should be next after the try block - try is cause issue(ways of unexpected behavior), catch is preventing mechanism

		try {
			int a=9;
			int b=0;
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println("Values cannot be divided by zero");
		}

		System.out.println("--------------------------------------------------");

		/////////////////////////////////////////////////////////////////////////
		//		multiple catch blocks


		try {
			int a=9;
			int b = 0;
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Values cannot be divided by zero");
		}
		catch(NullPointerException e) {
			System.out.println("Null point exception is here");
		}

		System.out.println("--------------------------------------------------");

		/////////////////////////////////////////////////////////////////////////
		//		finally will be executed even if catch block is executed or not


		try {
			sc=new Scanner(System.in);
			System.out.println("Enter Number: ");
			String str=sc.nextLine();
			System.out.println("Entered String is:" +str);
		}
		catch(NullPointerException e) {
			System.out.println("Null point exception is here");
		}
		finally {
			try {
				if(sc != null) {
					sc.close();
				}
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		}

		/////////////another example for finally

		try {
			System.out.println("Try block");
			throw new Exception(); // we include exception here to explain exception
		}
		catch(Exception exe) {
			System.out.println("Null point exception is here");
		}
		finally {
			System.out.println("Inside finally block");
		}

		System.out.println("--------------------------------------------------");

		/////////////////////////////////////////////////////////////////////////
//		The statements present in the finally block execute even if the try block 
//							contains control transfer statements like return, break or continue


		try {
			System.out.println("Try block");
			System.out.println(ExceptionHandling.dummy());

		}
		catch(Exception exe) {
			System.out.println("Null point exception is here");
		}
		finally {
			System.out.println("Inside finally block");
		}
		
		System.out.println("--------------------------------------------------");


		/////////////////////////////////////////////////////////////////////////
//		System.exit(0) - finally non executed situations
		
		try {
			System.out.println("Try block");
			System.exit(0);
			System.out.println(2/0);
			System.out.println("After exception");
		}
		catch(Exception exe) {
			System.out.println("Null point exception is here");
		}
		finally {
			System.out.println("Inside finally block");
		}

	}

	public static int dummy() {
		return 3;
	}

}
