package chapter1.polymorphismdemo;

//compile time poly morphism
//static binding
//which can be achieved uing overloading of methods
//overloading can be achieved eithe by differing no of parameters or type of 
//parameters or order of parameters
public class Addition {

	public void sum() {
		int a = 5;
		int b = 6;
		int s = a + b;
		System.out.println("1. sum is: " + s);
	}
	
	public void sum(int a) {
		int b = 6;
		int s = a + b;
		System.out.println("2. sum is: " + s);
	}
	
	public void sum(int a, int b) {
		int s = a + b;
		System.out.println("3. sum is: " + s);
	}
	
	public void sum(double a, double b) {
		double s = a + b;
		System.out.println("4. sum is: " + s);
	}
	
	public void sum(int a, double b) {
		double s = a + b;
		System.out.println("5. sum is: " + s);
	}
	
	public void sum(double b , int a) {
		double s = a + b;
		System.out.println("6. sum is: " + s);
	}
	
	public double sum(double b , int a, double c) {
		double s = a + b;
		System.out.println("6. sum is: " + s);
		return s;
	}
	
	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.sum(4, 5);
		addition.sum(4.2, 5, 3.5);
	}

}
