package Inheritance;

public class ChildClassInheritance extends ParentClassInheritance {

	//Data Type
	int bonus = 50000;

	//Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClassInheritance CI = new ChildClassInheritance();
		
		System.out.println(CI.bonus);
		
		System.out.println(CI.salary);
		
		CI.displayInformation();
		
		CI.printInformation();
		
		staticMethod();
		
		Sample.testing();
		
		
	}

}
