package chapter2.innerdemo;

public class InnerClassDemo {

	{
		System.out.println("outer init block");
	}

	public String outerVar = "this is outer variable";

	public void outerMethod() {
		System.out.println("this is outer method");
	}

	public InnerClassDemo() {
		System.out.println("outer default constructor");
	}

	public class InnerDemo {

		{
			System.out.println("inner init block");
		}

		public String innerVar = "this is inner variable";

		public  void innerMethod() {
			System.out.println("this is inner method");
		}

		public InnerDemo() {
			System.out.println("inner default constructor");
		}
	}
	
	public static void main(String[] args) {
		InnerClassDemo outerObj = new InnerClassDemo();
		System.out.println(outerObj.outerVar);
		outerObj.outerMethod();
		
		System.out.println("=========================");
		
		InnerDemo innerObj = outerObj.new InnerDemo();
		System.out.println(innerObj.innerVar);
		innerObj.innerMethod();
		
		InnerDemo innerObj1 = new InnerClassDemo().new InnerDemo();
		InnerDemo innerObj2 = new InnerClassDemo().new InnerDemo();
		InnerDemo innerObj3 = outerObj.new InnerDemo();
	
	}

}

//1. Non-static Inner Class
//2. Static Inner class
//3. Local Inner class
//4. Anonymous Inner Class