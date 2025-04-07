package chapter2.lambdademo;

public class Demo1 {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("hello from thread");
			}
		};
		new Thread(runnable).start();

		Runnable r = () -> System.out.println("hello from thread using lambda");
		new Thread(r).start();

		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("hello from thread again");
			}
		});

		th.start();

		Thread t = new Thread(() -> System.out.println("hello from thread again using  lambda"));
		t.start();
		
		new Thread(() -> System.out.println("hello from thread using lambda again again")).start();;

	}

}
