package com.javacrash.constructor;

/**
 * @author Vethiga
 *
 * 
 */
public class Vi04_4_Draw {

	String Draw;
	
	// It's example for constructor overloading
	
	public Vi04_4_Draw() {
		// TODO Auto-generated constructor stub
		System.out.println("It's non parameterized constructor");
	}
	
	public Vi04_4_Draw(String todraw){
		this.Draw=todraw;
		System.out.println("It's parameterized constructor and parsing value is "+todraw);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object names will be different(Draw1,Draw2)
		Vi04_4_Draw Draw1=new Vi04_4_Draw();
		Vi04_4_Draw Draw2=new Vi04_4_Draw("Circle");
		
		
	}

}
