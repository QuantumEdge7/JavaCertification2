package chapter2.enumdemo;

public class ArithmeticConstant {

	public static final String ADD = "add";
	public static final String SUB = "Sub";
	public static final String DIV = "div";
	public static final String MUL = "mul";

	public static void main(String[] args) {
		System.out.println(ArithmeticConstant.ADD);

//		for (int i = 1; i <= 4; i++) {
//			System.out.println();
//		}

		switch (ArithmeticConstant.SUB) {
		case "add":
			System.out.println("this is addition");
			break;
		case "sub":
			System.out.println("this is subtraction");
			break;
		case "div":
			System.out.println("this is division");
			break;
		case "mul":
			System.out.println("this is multipication");
			break;
		default:
			System.out.println("wrong selection");
		}
		System.out.println("exit");
	}

}
