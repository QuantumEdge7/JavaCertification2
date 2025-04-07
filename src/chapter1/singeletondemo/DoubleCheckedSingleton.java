package chapter1.singeletondemo;

public class DoubleCheckedSingleton {

	private static volatile DoubleCheckedSingleton instance;

	private DoubleCheckedSingleton() {

	}

	public static DoubleCheckedSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckedSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckedSingleton();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		DoubleCheckedSingleton obj1 = DoubleCheckedSingleton.getInstance();
		DoubleCheckedSingleton obj2 = DoubleCheckedSingleton.getInstance();
		System.out.println("obj1 is: " + obj1);
		System.out.println("obj2 is: " + obj2);
	}
}
