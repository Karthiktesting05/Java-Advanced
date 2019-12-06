package Encapsulation;

public class EncapsulationClass1 {

	public void sample() {

		System.out.println("Passed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsulationClass EC = new EncapsulationClass();

		EC.setName("Srinivas");

		System.out.println(EC.getName());

		EC.setName("SELENIUM");

		System.out.println(EC.getName());

	}

}
