package chapter2.innerdemo;

public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		AnonymousInnerClass obj = new AnonymousInnerClass() {

			@Override
			public void greet() {
				System.out.println("hello, good morning");
				sayHi();
			}
			
			public void sayHi() {
				System.out.println("hi");
			}

		};
		obj.greet();
		//obj.sayHi();
		

	}

}
