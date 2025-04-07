package chapter2.enumdemo;

//implemented Printable interface
public enum TrafficLightEnum implements Printable {

	//we ar calling constructor and overiding abstract method
	RED(20, "Stop") {

		@Override
		public String getAction() {
			return "Car must stop.";
		}

	},

	YELLOW(5, "Slow Down") {

		@Override
		public String getAction() {
			return "Prepare to stop.";
		}

	},
	GREEN(60, "Go") {
		@Override
		public String getAction() {
			return "Cars can go";
		}
	};

	//fields
	private final int duration;

	private final String description;

	//constructor
	private TrafficLightEnum(int duration, String description) {
		this.duration = duration;
		this.description = description;
	}

	//abstract method
	public abstract String getAction();

	//getter method
	public int getDuration() {
		return duration;
	}

	public String getDescription() {
		return description;
	}

	//overridden method
	@Override
	public void printDetails() {
		System.out.println(this + ": " + description + " for " + duration + " seconds.");
	}

}
