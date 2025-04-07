package chapter1.singeletondemo;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {

	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

	public static void main(String[] args) {
		ThreadSafeSingleton obj1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton obj2 = ThreadSafeSingleton.getInstance();
		System.out.println("obj1 is: " + obj1);
		System.out.println("obj2 is: " + obj2);
	}

}
