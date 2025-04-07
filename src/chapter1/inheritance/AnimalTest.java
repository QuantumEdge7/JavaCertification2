package chapter1.inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		// implicit object casting
		// by compiler
		Animal animal = new Dog();
		animal.makeSound();
		
		//animal.wags(;)
		
		Dog dog = new Dog();
		dog.wags();

		// Dog d = new Animal();

		//explicit object casting
		//by programmer
//		Animal a = new Animal();
//		Dog d = (Dog) a;

	}

}
