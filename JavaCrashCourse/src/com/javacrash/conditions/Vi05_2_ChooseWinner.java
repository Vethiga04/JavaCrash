package com.javacrash.conditions;

/**
 * @author Vethiga
 *
 * 
 */
public class Vi05_2_ChooseWinner {

	String Participant = "jakith";

	public void GuessingWinner() {
		if (Participant.equals("Yaweez")) {
			System.out.println("Winner is Yaweez");
		} else if (Participant.equalsIgnoreCase("Jakith")) { // ignore case sensitivity
			System.out.println("Winner is Jakith");
		} else if (Participant.equals("Gihaan")) {
			System.out.println("Winner is Gihaan");
		} else {
			System.out.println("Couldn't able to find the winner");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vi05_2_ChooseWinner choosewinner = new Vi05_2_ChooseWinner();
		choosewinner.GuessingWinner();
	}

}
