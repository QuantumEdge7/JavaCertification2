package chapter3.comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(13, "Nimisha"));
		employees.add(new Employee(12, "Saina"));
		employees.add(new Employee(11, "Faiza"));
		

		System.out.println("Before sorting: " + employees);
		Collections.sort(employees);
		System.out.println("After sorting by employee id: "+employees);

	}

}
