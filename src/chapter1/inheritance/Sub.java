package chapter1.inheritance;

public class Sub extends Super{
	
	public Sub () {
		System.out.println("child's default constructor");
	}
	
	
	//hiding variable
	String name = "child's name";
	
	//overriding methods
	public void greet() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println("hello from child");
		super.greet();
	}

}
