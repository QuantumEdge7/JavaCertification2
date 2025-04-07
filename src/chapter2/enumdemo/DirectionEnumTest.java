package chapter2.enumdemo;

public class DirectionEnumTest {

	public static void main(String[] args) {
		System.out.println(DirectionEnum.EAST);
		
		for(DirectionEnum dir: DirectionEnum.values()) {
			System.out.println(dir.name());
		}
		
		
		switch (DirectionEnum.WEST) {
		case EAST:
			System.out.println("This is east direction.");
			break;
		case WEST:
			System.out.println("This is west direction.");
			break;
		case SOUTH:
			System.out.println("This is south direction.");
			break;
		case NORTH:
			System.out.println("This is north direction.");
			break;
		default:
			System.out.println("wrong direction.");
			break;
		}
		System.out.println("exit");

	}

}
