package Interface;

	public class Class2 implements Class1{

		
		//Interface = implements
		//Normal Classes = inheritance = extends
		
		public void students(){
			
			System.out.println("This is Student Function");
			
		}
		
	public void Employees(){
			
			System.out.println("This is Employee Function");
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class2 obj = new Class2();
		
		System.out.println("This is child class");
		
		obj.students();
		obj.Employees();
		
	}

	
}
