package chapter1.staticdemo;


//3. we can not use static keywords on class
public /* static */ class StaticDemo1 {
	
	static int a;
	
	static {
		a = 0;
		System.out.println("this is static block");
	}
	
	//4. we can not use static keywords on constructor too
	public /* static */ StaticDemo1() {
		
	}

	//1. we can use sstatic keywords on variable & constants
	static String name = "Faiza";

	//2.we can use static keywords on methods
	public static void greet() {
		System.out.println("Hello, good morning from Nepal.");
	}

	public static void print() {
		System.out.println(name);
		greet();

		// best approach
		System.out.println(StaticDemo1.name);
		StaticDemo1.greet();
	}

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(name);
		greet();

		// best approach
		System.out.println(StaticDemo1.name);
		StaticDemo1.greet();
	}
	
	//5. we can use static keywords on innner class
	public static class InnerClass {
		
	}

}
