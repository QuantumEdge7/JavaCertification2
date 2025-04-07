package chapter2.enumdemo;

public enum DayEnum {

	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

	private int value;

	private DayEnum(int value) {
		this.value = value;
	}

	private int getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		switch (this) {
		case FRIDAY:
			return "Friday: " + value;
		case MONDAY:
			return "Monday: " + value;
		case SATURDAY:
			return "Saturday: " + value;
		case THURSDAY:
			return "Thursday: " + value;
		case TUESDAY:
			return "Tuesday: " + value;
		case WEDNESDAY:
			return "Wednesday: " + value;
		case SUNDAY:
			return "Sunday: " + value;
		default:
			return null;
		}
	}
}
