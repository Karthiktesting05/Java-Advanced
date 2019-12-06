package Polymorphism;

public class MethodOverloading {
	
	
	public void addition(int a, int b)
	{
		
		System.out.println(a+b);
		
	}
	
	public void addition(long a, long b)
	{
		
		System.out.println(a+b);
		
	}
	
	
	public void addition(double a, double b, int c)
	{
		
		System.out.println(a+b+c);
		
	}
	
	public void addition(int d, int e, int f, int g)
	{
		
		System.out.println(d+e+f+g);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading MO = new MethodOverloading();
		
		MO.addition(10, 20);
			
		MO.addition(10.20, 10.25, 10);
		
		MO.addition(10, 20, 30, 40);
		
	
	}

}
