package chapter3.comparatordemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class StudentTest {

	public static void main(String[] args) {
		TreeSet<Student> ageComp = new TreeSet<>(new Student());
		ageComp.add(new Student("John", 23));
		ageComp.add(new Student("Jack", 60));
		ageComp.add(new Student("Eliza", 20));
		ageComp.add(new Student("Josh", 29));
		ageComp.add(new Student("Tom", 35));

		Iterator<Student> itr = ageComp.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Highest age is: " + ageComp.last());
		System.out.println();

		List<Student> ageComp1 = new ArrayList<>();
		ageComp1.add(new Student("John", 23));
		ageComp1.add(new Student("Jack", 60));
		ageComp1.add(new Student("Eliza", 20));
		ageComp1.add(new Student("Josh", 29));
		ageComp1.add(new Student("Tom", 35));

		Iterator<Student> itr1 = ageComp1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
