package chapter2.enumdemo;

public class DayEnumTest {

	public static void main(String[] args) {
		for(DayEnum day: DayEnum.values()) {
			System.out.println(day.name());
		}
		
		System.out.println("SUNDAY".compareTo(DayEnum.SUNDAY.name()));
		
		//DayEnum d = new DayEnum();
		
		//DayEnum.SATURDAY = DayEnum.valueOf("New Value");
		
		DayEnum d= DayEnum.valueOf("THURSDAY");
		System.out.println(d);
		System.out.println(d.toString());
	}

}
