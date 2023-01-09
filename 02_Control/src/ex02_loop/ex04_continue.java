package ex02_loop;

public class ex04_continue {

	/*
	  continue 문
	  1. 반복문의 실행 시작 지점 부터 다시 실행
	  2. 어떤 코드를 제외 하고 반복문을 돌릴때 싶을 때 사용
	 */
	
	
	
	public static void ex01() {
		
		//1~50 사이 4의 배수 제외 하고 출력하기
		
		for(int a = 1; a <= 50; a++) {
			if(a % 4 == 0){
				continue;
			}
		
			System.out.println(a);
		}
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		ex01();

	}

}
