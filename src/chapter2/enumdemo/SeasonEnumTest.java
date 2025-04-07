package chapter2.enumdemo;

public class SeasonEnumTest {

	public static void main(String[] args) {
		for(SeasonEnum season: SeasonEnum.values()) {
//			System.out.println(season.name());
			System.out.println(season.getSeasonName());
		}

	}

}
