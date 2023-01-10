package ex03_method;

public class Calculator {

	//메소드(함수)
	/*
	  메소드의 형식
	  
	  반환 타입 메소드명(매개변수) {
	  
	 	메소드 본문
	 	
	 	return 반환값
	 	
	  }
	  
	  
	 1. 반환값 + 반환타입
	 
	 	메소드 실행의 결과
	 	
	 2. 메소드명
	 
	 	개발자 마음
	 	
	 3. 매개변수 	
	 			
	 	매소드로 전달되는 값(인수, argument)을 저장하는 변수
	 */
	
	
	
	
	/*
	 	메소드의 4가지 형식         									메소드 호출
	 	
	 	1. 반환값 x , 인수X (반환 값이 없음)					
	 	
	 	 	void  method(){												method();   ex) void ex01(){}
	 	 																				ex01();
	 	 	메소드 본문
	 	 	
	 	 	} 
	 	
	 	2. 반환값X, 인수O
	 																	int a = 0;
	 	 	void method(int arg) {										method(a);			
	 	 		메소드 본문
	 	 	}
	 	 	
	 	
	 	3. 반환값 0, 인수 x (반환값이 int 여야만 한다)								
	 																	int result;
	 		int method(){												result =method();				
	 			메소드 본문											
	 			return 반환값
	 		}
	 		
	 		
	 	4. 	반환값 0 , 인수 0											int a = 0;
	 																	int result;
	 		int method(int arg){										result = method(a);			
	 			메소드 본문															
	 			return 반환값
	 		}
	 		
	 		
	 */
	
	
	
	
	
	
	
	
	
	//addition 메소드 정의
	double addition(double a, double b) {
		
		return a + b;
		
	}
	
	
	double subtraction(double a, double b) {
		return a - b;
		  }
	
	
	
	
}
