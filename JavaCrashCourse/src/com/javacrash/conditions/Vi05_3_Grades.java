package com.javacrash.conditions;

/**
 * @author Vethiga
 *
 * 
 */
public class Vi05_3_Grades {

	int A = 93;

	public void CalculateGrade() {
		switch(A) {
		case 75 :
			System.out.println("You have 75 Marks");
			break;
		case 65:
			System.out.println("You have 65 Marks");
			break;
		case 83:
			System.out.println("You have 83 Marks");
			break;
		default:
		System.out.println("Marks are not ready to show yet");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vi05_3_Grades grades=new Vi05_3_Grades();
		grades.CalculateGrade();
	}

}
