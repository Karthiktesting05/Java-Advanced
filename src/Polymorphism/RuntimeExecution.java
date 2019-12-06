package Polymorphism;

public class RuntimeExecution extends RunTimePolymorphism {

	public void running() {

		System.out.println("Running on the track");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunTimePolymorphism RE = new RuntimeExecution(); // UpCasting

		RE.running();

	}

}
