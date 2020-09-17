package pl.com.home;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User("John", "Doe", 24);
		User u2 = new User();

		System.out.println(u1.toString());
		System.out.println(u1.getFirstName());
		System.out.println(u2.toString());
	}

}
