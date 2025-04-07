package chapter3.comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserTest1 {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User(1, "John"));
		users.add(new User(2, "Alice"));
		users.add(new User(3, "Bob"));
		System.out.println("Before sorting users are: " + users);

		// sorting a field based on user's name
		Collections.sort(users, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		System.out.println("after sorting users are: " + users);

		// sorting by multiple fields (name, id)
		Collections.sort(users, new Comparator<User>() {

			@Override
			public int compare(User u1, User u2) {
				int nameComparison = u1.getName().compareTo(u2.getName());
				if (nameComparison == 0) {
					return Integer.compare(u1.getId(), u2.getId());
				}
				return nameComparison;
			}

		});

		System.out.println("after sorting users are========>>>>>: " + users);

		// sorting a field based on user's name
		Collections.sort(users, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				return Integer.compare(o2.getId(), o1.getId());
			}
		});

		System.out.println("Sorted by id descending: " + users);

	}

}
