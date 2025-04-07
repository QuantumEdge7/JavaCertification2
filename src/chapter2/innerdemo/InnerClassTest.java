package chapter2.innerdemo;

import chapter2.innerdemo.InnerClassDemo.InnerDemo;

public class InnerClassTest {
	
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
