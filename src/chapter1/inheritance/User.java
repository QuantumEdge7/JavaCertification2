package chapter1.inheritance;

import java.util.Objects;

//POJO
public class User {

	String name;
	int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		String str = new String("Hello");
		System.out.println(str);

		User u1 = new User("John", 11);
		System.out.println(u1);// u.toString()
		System.out.println(u1.toString());
		
		
		User u2 = new User ("Frank", 22);
		System.out.println(u2.equals(u1));
		User u3 = u2;
		System.out.println(u2.equals(u3));
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(name, other.name);
	}


	
}
