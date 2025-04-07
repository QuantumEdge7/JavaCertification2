package chapter2.interfacedemo;

//interface give fully(complete) abstraction
//we can not use final keyword
public /* final */ /* abstract */ interface InterfaceDemo1 {

	// we can not write fully implemented method
//	void m1() {
//		
//	}

	//we can not write private, protected, static and final keywords
	void m1();

	public void m2();

	abstract void m3();

	public abstract void m4();// by default

	
	//we can not write private, protected or default keyword
	int a1 = 8;
	final int a2 = 9;
	static int a3 = 5;
	public int a4 = 3;
	static final int a5 = 6;
	public final int a6 = 7;
	public static int a7 = 2;
	public static final int a8 = 1;//default
	
	
	//we can not create constructor of an interface
//    public InterfaceDemo1 () {
//    	
//    }
	
	//we can not create an init block in an interface
//	{
//		
//	}
	
	//we can not create sstic block in an interface too
//	static {
//		
//	}
}
