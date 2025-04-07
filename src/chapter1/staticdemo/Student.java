package chapter1.staticdemo;

public class Student {

	//static variable
	static String collegeName = "abc";
	//non-static variable
	String name;

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
	}

}
