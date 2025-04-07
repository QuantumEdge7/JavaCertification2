package chapter2.finaldemo;

//1.final class can not be inherited
public /* final */ class FinalDemo {

	// 2.we can not override final method
	public /* final */ void greet() {
		System.out.println("Hello, good morning");
	}

	// 3.if we declare final variable, it must be initialized at time of declaration
	// we can not change the value of final variable i.e. it acts as constants
	final int a = 3;

	public void m1() {
//		a = 5;
	}

	//if we do not initialize final variable at time of declaration, 
	//we need to initialize via constructor
//	final int x;
	// 4.we can not use final keyword on constructor
//	public /* final */ FinalDemo(int x) {
//		this.x = x;
//	}

}
