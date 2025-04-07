package chapter1.singeletondemo;

public class BillPughSigleton {

	private BillPughSigleton (){
		
	}
	
	private static class Holder {
		private static final BillPughSigleton INSTANCE = new BillPughSigleton();
	}
	
	public static BillPughSigleton getInstance () {
		return Holder.INSTANCE;
	}
	
	public static void main(String[] args) {
		BillPughSigleton obj1 = BillPughSigleton.getInstance();
		BillPughSigleton obj2 = BillPughSigleton.getInstance();
		System.out.println("obj1 is: " + obj1);
		System.out.println("obj2 is: " + obj2);
	}
}
