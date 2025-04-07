package chapter1.singeletondemo;

public class EagerSingletonTest {

	public static void main(String[] args) {
		EagerSingleton obj1 = EagerSingleton.getInstance();
		EagerSingleton obj2 = EagerSingleton.getInstance();
		EagerSingleton obj3 = EagerSingleton.getInstance();

		System.out.println("obj1 is: " + obj1);
		System.out.println("obj2 is: " + obj2);
		System.out.println("obj3 is: " + obj3);
	}

}
