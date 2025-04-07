package chapter2.interfacedemo;

public class InterfaceTest {

	public static void main(String[] args) {
		// we can not create an object(instantiate) of an interface
		// InterfaceDemo1 obj = new InterfaceDemo1();
		// we can create any number of reference variable of an interface
		InterfaceDemo1 obj = new InterfaceDemoImpl();
		obj.m1();

	}

}
