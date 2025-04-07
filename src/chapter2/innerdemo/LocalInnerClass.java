package chapter2.innerdemo;

public class LocalInnerClass {

	public void sum() {
		int a = 5;

		class LocalInnerClassDemo {
			public LocalInnerClassDemo() {
				System.out.println("local inner class");
			}

			int b = 7;

			public void add() {
				int sum = a + b;
				System.out.println("sum is: " + sum);
			}
		}
		
		LocalInnerClassDemo obj = new LocalInnerClassDemo();
		obj.add();
	}
	
	
	public static void main(String[] args) {
		LocalInnerClass obj = new LocalInnerClass();
		obj.sum();
		
//		LocalInnerClassDemo ob = new LocalInnerClassDemo();
	}

}
