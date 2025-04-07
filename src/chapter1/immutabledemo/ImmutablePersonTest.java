package chapter1.immutabledemo;

public class ImmutablePersonTest {

	public static void main(String[] args) {
		ImmutablePerson person = new ImmutablePerson("Eliza", 23);
		System.out.println(person);
		//person.name = "abc";
		person = new ImmutablePerson("Abc", 23);
		
	}

}
