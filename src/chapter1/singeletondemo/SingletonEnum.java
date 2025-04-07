package chapter1.singeletondemo;

public enum SingletonEnum {

	INSTANCE;
	public void display() {
		System.out.println("Enum singleton Instance");
	}
	
	public static void main(String[] args) {
		SingletonEnum instance = SingletonEnum.INSTANCE;
		instance.display();
	
	}
}
