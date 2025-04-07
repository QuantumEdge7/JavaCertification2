package chapter2.innerdemo;

import chapter2.innerdemo.StaticInnerClassDemo.StaticInnerClass;

public class StaticInnerClassTest {

	public static void main(String[] args) {
		StaticInnerClassDemo.staticOuterMethod();
		System.out.println(StaticInnerClassDemo.staticOuterVar);

		System.out.println();

		System.out.println(StaticInnerClass.staticInnerVar);
		StaticInnerClass.staticInnerMethod();

		System.out.println();

		System.out.println(StaticInnerClass.staticInnerVar);
		StaticInnerClass.staticInnerMethod();
	}
}
