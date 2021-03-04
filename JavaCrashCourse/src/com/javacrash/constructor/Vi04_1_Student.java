package com.javacrash.constructor;
/**
 * @author Vethiga
 *
 * 
 */
public class Vi04_1_Student {

	String student_name;
	int marks; // return 0 value. but when we initialize with Integer class, then result will be Null..
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vi04_1_Student student=new Vi04_1_Student();
		System.out.println(student.student_name);
		System.out.println(student.marks);

	}

}
