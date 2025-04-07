package chapter1.immutabledemo;

import java.util.Collections;
import java.util.List;

public final class ImmutableStudent {

	private final String name;

	private final List<String> subjects;

	public ImmutableStudent(String name, List<String> subjects) {
		this.name = name;
		// an unmodifiable copy of the list
		this.subjects = Collections.unmodifiableList(subjects);

	}

	public String getName() {
		return name;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	@Override
	public String toString() {
		return "ImmutableStudent [name=" + name + ", subjects=" + subjects + "]";
	}

}
