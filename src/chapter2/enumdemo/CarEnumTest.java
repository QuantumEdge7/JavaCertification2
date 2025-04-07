package chapter2.enumdemo;

public class CarEnumTest {

	public static void main(String[] args) {
		CarEnum c1 = CarEnum.AUDI;
		System.out.println(c1.name()+": "+c1.getPrice());
		
		CarEnum c2 = CarEnum.valueOf("MERCEDES");
		System.out.println(c2.toString());
		
		CarEnum c3 = CarEnum.valueOf("Bmw");
		System.out.println(c3.toString());

	}

}
