package chapter2.enumdemo;

public enum CarEnum {
	
	AUDI {

		@Override
		public int getPrice() {
			return 30000;
		}
		
	},
	
	MERCEDES {
		@Override
		public int getPrice() {
			return 300000;
		}
	},
	
	BMW {
		@Override
		public int getPrice() {
			return 400000;
		}
	};
	
	public abstract int getPrice();

}
