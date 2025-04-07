package chapter1.polymorphismdemo;

import java.util.Scanner;

//run time polymorphism(dynamic binding)
//which can be achieved by overriding of methods
public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = null;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter animal choice: ");
		String choice = input.next();

		switch (choice) {
		case "dog":
			animal = new Dog();
			break;
		case "tiger":
			animal = new Tiger();
			break;
		default:
			System.out.println("wrong choice!!!");
			break;
		}
		getAnimalSounds(animal);

	}

	public static void getAnimalSounds(Animal animal) {
		animal.makeSound();
	}

}
