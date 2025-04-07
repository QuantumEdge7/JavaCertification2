package chapter1.singeletondemo;

public class LazySingletonTest {

	public static void main(String[] args) {
		LazySingleton obj1 = LazySingleton.getInstance();
		LazySingleton obj2 = LazySingleton.getInstance();
		LazySingleton obj3 = LazySingleton.getInstance();
		System.out.println("obj1 is: " + obj1);
		System.out.println("obj2 is: " + obj2);
		System.out.println("obj3 is: " + obj3);

	}

}
