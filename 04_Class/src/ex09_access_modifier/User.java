package ex09_access_modifier;

public class User {

	/*
	  메인에서 -> 메소드 -> 필드
	 */
	
	
	
	/*
	  접근 제어 지시자 (Access Modifier)
	  1. private  : 클래스 내부에서만 접근할 수 있다.
	  2. default  : 동일한 패키지에서만 접근할 수 있다.
	  3. protected: 동일한 패키지 또는 상송 관계의 클래스에서만 접근할 수 있다.
	  4. public   : 누구나 접근할 수 있다.
	  
	  
	 */
		/*
		  정보 은닉(Information Hiding)
		  1.클래스의 내부 정보를 외부에 노출하지 않는 것을 말한다.
		  2. 클래스의 내부 정보는 "필드" 를 의미하므로 "필드값" 을 외부에 공개 하지 않는다.
		  3."필드는" 는 private 하게 처리한다.
		  4. "메소드는" public 하게 처리한다. "필드"에 접근 하기 위해서는 "메소드" 를 통해서 접근해야 한다.
	
		 */
		
	/*
	  	Getter 와 Setter
	  	1. Getter 
	  		1) 필드값을 외부로 반출하는 메소드
	  		2) get + 필드 이름을 가지는데 이를 수정하면 안 된다.
	  		
	  	2. Setter
	  		1)외부로 부터 필드값을 받아오는 메소드
	  		2)set + 필드 이름을 가지는데 이를 수정하면 안 된다.
	  		
	  		
	  		
	  		
	 */
	
	
	
	
  //필드 private 무조건 붙이기
		private String id;
		private String pw;
		private boolean isVip;
		
		
		

//메소드
		public String getId() {
			return id;
		}
		
		public void setId(String id) {
			this.id = id;
			
		}
		public String getPw() {
			return pw;
		}
		
		
		public void setPw(String pw) {
			this.pw = pw;
		}
		
		public boolean isVip() {
			return isVip;
		}
		
		public void setVip(boolean isVip) {
			this.isVip = isVip;
		}
		
		
		
		
		
		//메소드
	
		
	
}
