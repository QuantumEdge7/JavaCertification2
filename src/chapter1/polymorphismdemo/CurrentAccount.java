package chapter1.polymorphismdemo;

public class CurrentAccount implements Account {

	@Override
	public void openAccount() {
		System.out.println("current account is opened");
	}
	
	public void withdraw() {
		System.out.println("money is withdrawn from curent account.");
	}

}
