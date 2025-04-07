package chapter3.comparatordemo;

import java.util.Arrays;
import java.util.Comparator;

public class UserTest2 {

	public static void main(String[] args) {
		User[] users = { new User(1, "John"), new User(1, "Alice"), new User(1, "Bob") };
		System.out.println("Before sorting users are: " + Arrays.toString(users));

		// sorting a field based on user's name
		Arrays.sort(users, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		System.out.println("after sorting users are: " + Arrays.toString(users));
	}

}
