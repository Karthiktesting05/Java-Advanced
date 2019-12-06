package Abstract;

public class AbstractClass1 extends AbstractClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractClass obj = new AbstractClass1(); //upcasting
		obj.vehicle();
		obj.run();
		
	}

	@Override
	public void run() {
		
		System.out.println("Running");
	}

	


}
