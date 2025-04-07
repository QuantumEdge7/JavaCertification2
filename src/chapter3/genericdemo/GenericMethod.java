package chapter3.genericdemo;


//2.Generic Method
//A method can have its own type parameter independent of the class
public class GenericMethod {
	
	public static <E> void printArray(E [] inputArray) {
		for(E element: inputArray) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
//	public static <T> void printArray(T [] inputArray) {
//		for(T element: inputArray) {
//			System.out.print(element+" ");
//		}
//		System.out.println();
//	}

	public static void main(String[] args) {
		Integer [] intArray = {4, 5,6,7, 8};
		printArray(intArray);
		
		Double [] doubleArray = {4.5, 5.7,6.8,7.9, 8.7};
		printArray(doubleArray);
		
		String [] stringArray = {"mango", "grapes", "orange"};
		printArray(stringArray);

	}

}
