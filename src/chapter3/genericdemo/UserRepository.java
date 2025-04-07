package chapter3.genericdemo;

public class UserRepository implements Repository<String> {

	@Override
	public void save(String item) {
		System.out.println("saving user: " + item);
	}

	@Override
	public String findById(int id) {
		return "User " + id;
	}
	
	public static void main(String[] args) {
		UserRepository userRepository = new UserRepository();
		userRepository.save("John");
		System.out.println(userRepository.findById(1));
	}

}
