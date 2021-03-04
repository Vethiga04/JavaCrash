package com.javacrash.statickeyword;
/**
 * @author Vethiga
 *
 * 
 */
public class StaticVariable {

	static String name=null;
	int id=0;
	
	public static void main(String[] args) {

		StaticVariable staticVariable=new StaticVariable();
		staticVariable.name="Gabii";
		staticVariable.id=2978;
		
		StaticVariable staticVariable2=new StaticVariable();
		staticVariable2.name="Farooz";
		staticVariable2.id=77622;
		
		System.out.println("Name in 1st object "+staticVariable.name);
		System.out.println("ID in 1st object "+staticVariable.id);
		System.out.println("Name in 2nd object "+staticVariable2.name); // in both object's variable has same value -> 
//																Farooz ( bcoz variable is static. It gets the lastly updated value)
		System.out.println("ID in 2nd object "+staticVariable2.id); // id will be changed. bcoz it's not the static variable
	}

}
