package chapter1.singeletondemo;

import java.lang.reflect.Constructor;

public class ReflectionEagerSingletonTest {

	public static void main(String[] args) {
		EagerSingleton obj1 = EagerSingleton.getInstance();
		EagerSingleton obj2 = null;

		try {
			Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();

			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				obj2 = (EagerSingleton) constructor.newInstance();
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

	}

}
