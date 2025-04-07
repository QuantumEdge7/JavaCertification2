package chapter2.abstractdemo;

public class Circle extends Shape {
	
	public Circle() {
		super();
		System.out.println("circle default constructor");
	}

	public void draw() {
		System.out.println("circle is drawn.");
	}
}
