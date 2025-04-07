package chapter2.innerdemo;

public class StaticInnerClassDemo {
	static {
		System.out.println("this is static outer block");
	}

	static String staticOuterVar = "This is static outer var";

	public static void staticOuterMethod() {
		System.out.println("this static outer method");
	}

	public static class StaticInnerClass {

		public StaticInnerClass() {
			System.out.println("static inner default var");
		}

		static {
			System.out.println("this is static inner block");
		}

		static String staticInnerVar = "This is static inner var";

		public static void staticInnerMethod() {
			System.out.println("this static inner method");
		}
	}

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
