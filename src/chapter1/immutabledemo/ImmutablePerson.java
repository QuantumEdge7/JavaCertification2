package chapter1.immutabledemo;


//1.simple immutable class
public final class ImmutablePerson {

	private final String name;
	private final int age;

	public ImmutablePerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "ImmutablePerson [name=" + name + ", age=" + age + "]";
	}

}
