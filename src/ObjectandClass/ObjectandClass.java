package ObjectandClass;

public class ObjectandClass {
	
/*	int id = 10; // Integer Data Members
	String name = "Karthik"; // Instance Variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectandClass obj = new ObjectandClass(); // Creating an object of ObjectandClass File
		
		System.out.println(obj.id);
		
		System.out.println(obj.name);
	}*/
	
	
	int rollNumber; // Those are variable and also data members
	String Name;
	
	//Method
	public void InsertRecord(int RollNumber, String n){
		rollNumber= RollNumber;
		Name=n;
	}
	
	
	public void InformationDisplay(){
		
		System.out.println(rollNumber + "  " + Name);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectandClass obj = new ObjectandClass();
		ObjectandClass obj1 = new ObjectandClass();
		
		
		obj.InsertRecord(402, "Karthik");
		obj1.InsertRecord(502, "JAG");
		
		
		obj.InformationDisplay();
		obj1.InformationDisplay();
		
		
	}
	
}
