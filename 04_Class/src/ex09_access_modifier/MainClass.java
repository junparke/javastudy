package ex09_access_modifier;

public class MainClass {

	public static void main(String[] args) {
		
		User user = new User();
		

		user.setId("admin");
		
		System.out.println(user.getId());
		
		
		
		user.setPw("1234");
		
		System.out.println(user.getPw());
		
	}

}
