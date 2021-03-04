package com.javacrash.programming_basics;

public class Vi03_ReturnType {

	 Integer CollectedAmount= 1200;
	
	public Integer CollectAmountGiveItToMe() {
		System.out.println("Collected Rupees is "+CollectedAmount+" and send it to you...");
		return CollectedAmount;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Vi03_ReturnType retType_Vi03=new Vi03_ReturnType();
		Integer amount=retType_Vi03.CollectAmountGiveItToMe();
		System.out.println("Got the amount "+amount);
	}

}
