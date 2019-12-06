package Arrays;

public class SingleDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initization
		int arr[] = new int[5]; //The size of the array is 5.
		
		//Declarization
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[3]);
		
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++){
			
			System.out.println(arr[i]);
			
		}
		
		
		int a[] = {10,20,30,40,50,60,70,80,90}; // The size of the array is 8
		
		for(int i=0; i<a.length; i++){
			
			System.out.println("#############################################");
			System.out.println(a[i]);
			
		}
		
		
		
		String[] CityNames = new String[4]; //The size of the array is 4
		
		CityNames[0] = "Hyderabad";
		CityNames[1] = "Chennai";
		CityNames[2] = "Bangalore";
		CityNames[3] = "Hitech City";	
		
		
		for(String xyz : CityNames){
			
			if(xyz == "Chennai"){
				
				System.out.println("My City name is " +xyz);
				
				break;
			}
		
			System.out.println(xyz);
			
		}
	
		
		
	}

}
