package com.javacrash.conditions;
/**
 * @author Vethiga
 *
 * 
 */
public class Vi05_1_ReceiveAnAward {

	boolean IsPassInVotes;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// handling by creating objects.. didn't learn on static variables sill. tht's y we're using with creating objects
		Vi05_1_ReceiveAnAward receiveAnAward=new Vi05_1_ReceiveAnAward();
		
		
		if(receiveAnAward.IsPassInVotes) {
			System.out.println("Congratultions!!! You received the award!!!");
		}
		else {
			System.out.println("We appreciate your contribution. We'll hope u to receive the award in next year...!!!");
		}
		
	}

}
