package chapter1.inheritance;

public class Super {
	
	public Super() {
		System.out.println("parent's default constructor");
	}

	// hidden variable
	String name = "parent's name";

	//overridden methods
	public void greet() {
		System.out.println("hello from parent");
	}
}

//not inherited
//1.private members
//2.hidden variable
//3.overriden methods
//4.constructor