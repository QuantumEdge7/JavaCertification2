package chapter3.genericdemo;


//4.Bounded Type Parameters
//We can constrain the types that can be used as
//type parameters using extends or super
public class NumericBox<T extends Number> {

	private T number;

	public NumericBox(T number) {
		this.number = number;
	}

	public double getDoubleValue() {
		return number.doubleValue();
	}

	public static void main(String[] args) {
		NumericBox<Integer> intBox = new NumericBox<>(100);
		System.out.println("Integer double value: " + intBox.getDoubleValue());

		NumericBox<Double> doubleBox = new NumericBox<>(99.95);
		System.out.println("Double value: " + doubleBox.getDoubleValue());
		
		//NumericBox<String> stringBox = new NumericBox<>("hello");
	}

}
