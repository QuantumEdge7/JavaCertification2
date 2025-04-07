package chapter1.immutabledemo;

import java.util.List;

public class ImmutableStudentTest {

	public static void main(String[] args) {
		List<String> subjects = List.of("Math", "Physics");
		ImmutableStudent student = new ImmutableStudent("John", subjects);
		
		System.out.println(student);
		
		//gives java.lang.UnsupportedOperationException
		student.getSubjects().add("Chemistry");
		
		//few example of mutable class in java library
		//String, Integer, LocalDate and BigDecimal

	}

}
