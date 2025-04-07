package chapter2.abstractdemo;


//5.if we extends any abstract class, we must override(implement)
//all abstract method of thet class

//6.if we do not want to override an abstract method
//of an abstract class, then need to declare child class
//alos an abstract
public /* abstract */ class Triangle extends Shape {

	public void draw() {
		System.out.println("triangle is drawn.");
	}
	
	public Triangle() {
		super();
		System.out.println("Triangle default constructor");
	}
}
