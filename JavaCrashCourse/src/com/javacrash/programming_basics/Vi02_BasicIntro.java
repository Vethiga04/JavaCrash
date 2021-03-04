package com.javacrash.programming_basics;



public class Vi02_BasicIntro {

	Long AccountNum = 908339367493l; //have to put l in last of value
	String Name="Vethiga";
	int Balance=678;
	
	public void AccountDetails() {
		System.out.println("Account Number is: "+AccountNum);
	}
	
	public static void main(String[] args) {
		// ClassName objectName=new ClassName();
		
		Vi02_BasicIntro basicInto_Vid01=new Vi02_BasicIntro();
		basicInto_Vid01.AccountDetails();
		
	}

}
