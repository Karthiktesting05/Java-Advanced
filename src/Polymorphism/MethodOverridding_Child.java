package Polymorphism;

public class MethodOverridding_Child extends MethodOverriding_Parent{

	int speedlimit = 150;
	
	public void running(){
		
		System.out.println("BIKE is running FASTLY");
	}

	
	public void Training(){
		
		System.out.println("JAVA Training Session");
	} 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodOverriding_Parent MO = new MethodOverriding_Parent();
		
		//MethodOverriding_Parent MO = new MethodOverridding_Child(); //Upcasting

		MO.Training();
		
		MO.running();
		
		System.out.println(MO.speedlimit);
		
	}

}
