package AccessModifier;

public class AccessModifier {

	private void PRIVATEMETHOD(){
		
		System.out.println("This is PRIVATE METHOD.");
	}
	
	
	public void PUBLICMETHOD(){
		
		System.out.println("This is PUBLIC METHOD");
	}
	
	
	void DEFAULTMETHOD(){
		
		System.out.println("This is DEFAULT METHOD");
	}
	


	protected void PROTECTEDMETHOD(){
		
		System.out.println("This is PROTECTED METHOD");
	}

	

	public static void main (String args[]){
	
		AccessModifier AM = new AccessModifier();
	
		AM.PUBLICMETHOD();
		AM.PRIVATEMETHOD();
		AM.PROTECTEDMETHOD();
		AM.DEFAULTMETHOD();
		
	}
	
	
}
