package ex01_branch;

public class Ex04_switch {
	/*
	switch(표현식) {
	case 값1: 실행문 
	case 값2: 실행문
	...
	default: 실행문(if else 같은 개념)
	}
	
	
		표현식의 결과로 사용하는 타입
			-int
			-string

	
		표현식의 결과로 사용 불가능한 타입
			-boolean
			-long
			-double
	*/
	
	
	public static void ex01() {
		
		
	int month =7;
		
	switch(month) {
		case 12: case 1: case 2: System.out.println("겨울");
	break;
		case 3:case 4: case 5: System.out.println("봄");
	break;
		case 6: case 7: case 8: System.out.println("여름");
	break;
		default: System.out.println("가을");
		}	
		
	}
	
	public static void ex02() {

		
		
	 
		int day = 13;
		
		String weekName;
		
		switch(day%7 ) {
		case0 : weekName = "토"; break;
		case1 : weekName = "월"; break;
		case2 : weekName = "화"; break;
		case3 : weekName = "수"; break;
		case4 : weekName = "목"; break;
		case5 : weekName = "금"; break;
		default : weekName = "일"
		}
	System.out.println(day + "일" + weekName + "요일이다.");
	
	int day = 13;
	
	String weekName;
	
	switch(day%7 ) {
	case0 : weekName = "토"; break;
	case1 : weekName = "월"; break;
	case2 : weekName = "화"; break;
	case3 : weekName = "수"; break;
	case4 : weekName = "목"; break;
	case5 : weekName = "금"; break;
	default : weekName = "일"
	}

	punlic staticc void ex03() {}

	public static void ex03() {
		
	
	}
    
	
	
	//수 우 미 양 가 잘못된 점수
	
	int score = 50;
	
	switch(score/10) {
	case10 : 
		case10 : 
	
	}
	
	
	
	//1분기 1~3   ,   2분기 4~6   , 3분기  7~9  ,   4분기 10 ~ 12
	
	int month = 1;
	
	switch ()
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ex02();
			
		}
	
	}


