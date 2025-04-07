package chapter2.lambdademo;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator add = new Calculator() {

			@Override
			public int operate(int a, int b) {
				return a + b;
			}
		};

		Calculator addLambda = (a, b) -> a+b;
		

		Calculator sub = new Calculator() {

			@Override
			public int operate(int a, int b) {
				return a - b;
			}
		};
		
		Calculator subLambda = (a,b) -> a-b;

		System.out.println(add.operate(4, 5));
		System.out.println(sub.operate(6, 5));
		
		System.out.println(addLambda.operate(4, 5));
		System.out.println(subLambda.operate(6, 5));


	}

}
