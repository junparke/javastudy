package ex08_this;

public class main {

	public static void main(String[] args) {
		
		User user = new User("admin", "123456");  //user 객체 생성
		
		//user에 저장된 값은 생선된 user 객체 참조값이다.
		
		System.out.println(user);
		
		//user 객체의 this 값 확인
		
		user.printThis();
		
		user.info();
	
		
	}

}
