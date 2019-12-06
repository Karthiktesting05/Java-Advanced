package Inheritance;

public class ParentClassInheritance extends Sample{

	
	/*
	Class4: A Class4 is a Logical Entity it contains logics of an application.

	Class4 is a Blue Print.

	Single Class4

	Class4 Keyword

	========================================================================

	Object: Object is the Physical entity it representing memory.

	Object Creation

	Multiple Objects

	New Keyword.
	*/
	
	//Data Members Or Data Type
	public float salary = 50000f;
	
	//Static Method
	public static void staticMethod(){
		
		System.out.println("Static Method Calling");
	}

	//Methods
	public void displayInformation(){
		
		System.out.println("This is Sample Example for Inheritance");
	}
	
	//Methods
	public void printInformation(){
			
			System.out.println("This is JAVA EXAMPLE");
	}
	
	
	//Unable to run this class because we dont have main method.
	
}
