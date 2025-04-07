package chapter1.inheritance;

public class Derived extends Base {

	public Derived() {
		super("hello");
		System.out.println("child's default constructor ");
	}

	public Derived(int a) {
		System.out.println("child parameterized constructor");
	}

}
