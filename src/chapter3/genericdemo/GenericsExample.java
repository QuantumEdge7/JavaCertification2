package chapter3.genericdemo;

import java.util.List;

public class GenericsExample {

	public static Number sum(List<? extends Number> numbers) {
		double s = 0.0;
		for (Number n : numbers) {
			s += n.doubleValue();
		}
		return s;
	}
	
	public static void main(String[] args) {
		List<Integer> intList = List.of(2,6,8,9);
		System.out.println(sum(intList));
		
		List<Double> doubleList = List.of(2.5,6.4,8.9,9.3);
		System.out.println(sum(doubleList));
		
		List<String> strList = List.of("Hi", "Hello");
		//System.out.println(sum(strList));
	}

}
