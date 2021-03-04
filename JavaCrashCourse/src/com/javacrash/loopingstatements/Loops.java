package com.javacrash.loopingstatements;
/**
 * @author Vethiga
 *
 * 
 */
public class Loops {

	public static void main(String[] args) {


		for(int i=0;i<25;i++) {
			System.out.println("For Loop Num: "+ i + "  Welcome to learn automation....");
		}
		
		System.out.println("\n");
		
		int j=0;
		while(j<25) {
			System.out.println("While Loop Num: "+ j + "  Welcome to learn automation....");
			j++;
		}
		
		System.out.println("\n");
		
		int k=0;
		do {
			System.out.println("Do-While Loop Num: "+ k + "  Welcome to learn automation....");
			k++;
		}while(k<25);
		
	}

}
