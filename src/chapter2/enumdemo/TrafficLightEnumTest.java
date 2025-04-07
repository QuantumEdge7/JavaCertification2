package chapter2.enumdemo;

public class TrafficLightEnumTest {

	public static void main(String[] args) {
		System.out.println("Traffic Light Details: ");
		for (TrafficLightEnum light : TrafficLightEnum.values()) {
			light.printDetails();
			System.out.println("Action: " + light.getAction());
			System.out.println("Ordinal: " + light.ordinal());
			System.out.println();
		}

		TrafficLightEnum greenLight = TrafficLightEnum.valueOf("GREEN");
		System.out.println(greenLight);
		System.out.println("Duration: " + greenLight.getDuration());

	}

}
