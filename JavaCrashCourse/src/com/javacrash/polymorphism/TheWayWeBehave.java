package com.javacrash.polymorphism;
/**
 * @author Vethiga
 *
 * 
 */
public class TheWayWeBehave {



	public void BehaviorWithParents(Parents thebhavior) {
		System.out.println("Will behave with respect and kind");
	}

	public void BehaviorWithParents(Boss thebhavior) {
		System.out.println("Will behave like higher position employee");
	}

	public void BehaviorWithParents(Partner thebhavior) {
		System.out.println("Will behave with love");
	}


	public static void main(String[] args) {

		TheWayWeBehave weBehave=new TheWayWeBehave();
		
		Parents parents=new Parents();
		weBehave.BehaviorWithParents(parents);
		
		Boss boss=new Boss();
		weBehave.BehaviorWithParents(boss);
		
		Partner partner=new Partner();
		weBehave.BehaviorWithParents(partner);

	}

}
