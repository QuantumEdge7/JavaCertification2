package chapter2.abstractdemo;

//1. if class is an abstract, then there is no
//necessary to have an abstract method in class

//2.if we have an abstract method in a class, we must declare class 
//as an abstract

//3.we can not use final keyword on an abstract class
public /* final */ abstract class Shape {

	// 4.we can not use final, static and private keyword
	// on an abstract method
	public abstract void draw();

	// 10.we can have any no of conctrete(fully implemented) method
	// in an abstract class
	public void paint() {
		System.out.println("shape is painted");
	}

	public Shape() {
		System.out.println("shape default constructor");
	}

}
