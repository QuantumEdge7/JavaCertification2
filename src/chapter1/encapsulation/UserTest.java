package chapter1.encapsulation;

public class UserTest {

	public static void main(String[] args) {
		User user = new User();
		// set
		user.setName("Test");
		user.setAge(22);
		// get
		System.out.println(user.getName());
		System.out.println(user.getAge());

	}

}
