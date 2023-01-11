package ex06_default_canstructor;

public class MainClass {

	/*
	   	생성자(Constructor)
	   	1. 객체를 생성할때 사용되는 메소드
		2. new 키워드 이후에 호출된다.
		3. 특징 
			1)"  생성자의 이름"은 " 클레스의 이름 "과 같다.
			2)  반환 타입이 존재하지 않는다. 
			3) 매개 변수는 일반 메소드와 동일하게 사용 한다. 
		
	 */
	
	/*
	  	디폴트 생성자
	  	1. 개발자가 생성자를 만들지 않으면 자동으로 사용되는 생성자이다. 
	  	2. 매개변수가 없고, 본문이 비어있는 형태이다.
	  	
	  	
	 */
	
	
	public static void main(String[] args) {
		
		
		//user 객체 생성(생성자가 자동으로 호출되는 지점)
		
		
		User user = new User();
		
		//info  메소드 호출
		user.info();
		

	}

}
