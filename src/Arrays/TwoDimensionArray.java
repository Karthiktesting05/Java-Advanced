package Arrays;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numbers = new int[5][5];

		numbers[0][0] = 1;
		//numbers[0][1] = 6;
		numbers[1][1] = 2;
		numbers[2][2] = 3;
		numbers[3][3] = 4;
		numbers[4][4] = 5;

		System.out.println(numbers.length);

		for (int i = 0; i < numbers.length; i++) {

			
			for (int j = 0; j < numbers.length; j++) {

				if(numbers[i][j] == 0){
					
					System.out.print("*");
				} else {
					
					System.out.print(numbers[i][j]);
				}
				
				
			}
			
			System.out.println();
		}

		/*
		 * int[] sub = numbers[i];
		 * 
		 * //System.out.println(sub.length); for(int x = 0; x<sub.length; x++){
		 * 
		 * System.out.print(sub[x]+ " "); }
		 * 
		 * System.out.println();
		 */

		String[][] Names = new String[2][3];

		Names[0][0] = "Karthik";
		Names[0][1] = "Mohan";
		Names[0][2] = "Swathi";

		Names[1][0] = "Bobby";
		Names[1][1] = "Balaji";
		Names[1][2] = "Phani";

		for (String[] xyz : Names) {

			for (String element : xyz) {

				if (element == "Balaji") {

					System.out.println(element);

					break;
				}

				System.out.println(element);
			}

			System.out.println();

		}

	}

}
