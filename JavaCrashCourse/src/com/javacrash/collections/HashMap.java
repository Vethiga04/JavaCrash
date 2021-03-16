package com.javacrash.collections;
/**
 * @author Vethiga
 *
 * 
 */
public class HashMap {
	
	public static void main(String[] args) {
		
		java.util.HashMap<Integer,String> EmployeeMap=new java.util.HashMap<Integer,String>();
		EmployeeMap.put(0, "Zamrin"); // means ENTRY(Key+Value) is called as ENTRY
		EmployeeMap.put(1, "Zagero");
		System.out.println("Initial Map: "+EmployeeMap);
		
		java.util.HashMap<Integer, String> DuplicateMap=new java.util.HashMap<>();
		DuplicateMap.putAll(EmployeeMap);
		System.out.println("After the duplication of map: "+DuplicateMap);
		
		DuplicateMap.clear();
		System.out.println("After Clearing all elements: "+DuplicateMap);
		
		System.out.println("Is Key Value 2 is available or not: "+EmployeeMap.containsKey(2));
		
	    System.out.println("After using cloning Method: "+EmployeeMap.clone());
	    
	    System.out.println("Map is Empty or not: "+EmployeeMap.isEmpty());
	    
	    System.out.println("Map's key set"+EmployeeMap.keySet());
	    
	    System.out.println("Get particular value from Map:"+EmployeeMap.get(0));
	    
	    System.out.println("Map's all values: "+EmployeeMap.values());
	    
	    System.out.println("Retrieving Key and Values of Map: "+EmployeeMap.entrySet());
	    
	    
	}

}
