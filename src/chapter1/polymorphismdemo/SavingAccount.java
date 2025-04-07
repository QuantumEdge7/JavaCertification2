package chapter1.polymorphismdemo;

public class SavingAccount implements Account {

	@Override
	public void openAccount() {
		System.out.println("saving account is opened");
	}
	
	public void depost() {
		System.out.println("money is deposited in saving account.");
	}

}
