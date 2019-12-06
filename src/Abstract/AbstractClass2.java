package Abstract;

public class AbstractClass2 extends AbstractClass {

	public void run(){
		
		System.out.println("Running on the road");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractClass obj = new AbstractClass2(); // Upcasting
		
		obj.run();
		obj.vehicle();
		
	}

	

}
