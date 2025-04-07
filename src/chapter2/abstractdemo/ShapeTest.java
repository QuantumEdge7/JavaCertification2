package chapter2.abstractdemo;

public class ShapeTest {

	public static void main(String[] args) {
		//8.we can not instatinate(create an object) of an abstract clas
		//Shape sh  = new Shape();
		//9.we can create any number of reference variable
		//of an abstract class
		Shape shp;
		Shape shape = new Triangle();
		shape.draw();
		
		shape = new Circle();
		shape.draw(); 

	}

}
