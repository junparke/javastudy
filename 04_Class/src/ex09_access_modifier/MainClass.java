package ex09_access_modifier;

public class MainClass {

	public static void main(String[] args) {
		
		//클레스에서 변수는 객체라고 부름  -> 객체는 메소드를 불러옴
		
		//user 객체 생성
		User user = new User();
		
		//객체 id 전달
		user.setId("admin");
		
		
		
		//id 확인
		System.out.println(user.getId());
		
		
		//객체 pw 전달하기
		user.setPw("1234");
		
		
		//pw확인
		System.out.println(user.getPw());
		
	}

}
