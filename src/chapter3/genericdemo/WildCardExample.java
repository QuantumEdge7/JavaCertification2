package chapter3.genericdemo;

import java.util.ArrayList;
import java.util.List;

//5.Wildcard in generics
//Wildcards (?) are used for unknown types
public class WildCardExample {

	public static void printList(List<?> li) {
		for (Object element : li) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		
		List<String> strList = new ArrayList<>();
		strList.add("hello");
		strList.add("hi");
		
		printList(intList);
		printList(strList);
	}
}
