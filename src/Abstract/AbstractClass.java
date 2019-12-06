package Abstract;

abstract class AbstractClass {
	
	//Abstract class can have abstract and non-abstract methods.
	//Abstract class doesn't support multiple inheritance. But single inheritance is possible.
	
	//Non Abstract Method
	public static void vehicle(){
		
		System.out.println("Vehicle running");
	}
	
	// We have to provide only method name and Functionality should be developed in another class where you have to call this method.
	
	//Abstract Method
	public abstract void run();
	

}

