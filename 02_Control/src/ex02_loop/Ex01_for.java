package ex02_loop;

public class Ex01_for {
	/*
	 	for문 
	 	1. 연속된 숫자를 생성하는 반복문(배열에서 자주 사용)\ 방법은 다양하다 
	 	2. 형식 
	 		for(초기문; 조건문; 증감문) {
	 		실행문
	 		}	
	 */
	
	
	public static void ex01( ) {
		//1~10     a++ or ++a 아무거나상관 없다 /
		//초기문 실행 -> (for문 만 초기 1번실행)조건문 만족하면 돌아가서(ex a=1) -> 그 다음 만족하는 식(ex a=2)
		
		for(int a =1; a <= 10; a++) {
			System.out.println(a);
		}
		
		
	}
	
	public static void ex02( ) {
		
		//횟수 (5번) 개발자들은 0부터 시작하는거 선호
		int count = 5;
		
		
		
		for(int a = 0; a < count; a++) {
			System.out.println("Hello world");
		}
		
		
		
		
	}
	
	public static void ex03( ){

	
		//연습
		//10 ~ 1
		for(int a = 10; a >=1; a--){
			System.out.println(a);
		}  
		
	
	}
	public static void ex04( ){
		
		int count = 10;
		
		for(int a = 1; a < count; a++){
		 int j = 2; //이곳에 원하는 구구단 넣기.
			System.out.println(j+"*"+a+"="+j*a);
		}
	
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	public static void main(String[] args) {
		ex04();
	}

}
