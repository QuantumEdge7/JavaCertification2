package chapter2.enumdemo;

public enum SeasonEnum implements I1, I2 /* extends Demo */ {

	WINTER("winter"), SUMMER("summer"), SPRING("spring"), FALL("fall");

	// fields
	private String seasonName;

	// contructors
//	private SeasonEnum () {
//		
//	}

	private SeasonEnum(String seasonName) {
		System.out.println("season enum constructor");
		this.seasonName = seasonName;
	}

	// methods
	public String getSeasonName() {
		return seasonName;
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

}
