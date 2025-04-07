package chapter1.composition;

public class Car {

	Engine engine;
	public Car() {
		engine = new Engine();
	}

	public void moveCar() {
		engine.startEngine();
		System.out.println("car moved.");
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.moveCar();
	}

}
