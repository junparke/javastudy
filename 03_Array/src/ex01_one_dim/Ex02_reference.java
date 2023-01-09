package ex01_one_dim;

public class Ex02_reference {

	
	public static void ex01() {
		/*
		  arr  arr 은 주소 , 참조, 번지 값을 가지고 있다
		  arr[0]
		  arr[1]
		  arr[2]
		  arr[3]
		  arr[4]
		 */
		
		int[] arr;
		
		arr = new int[5];
		
		System.out.println(arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void ex02() {
		
		int[] arr;
		arr = new int[5];
		
		System.out.println(arr); // 5개 배열 요소의 참조(주소,번지)값   -> 출력값 [I@182decdb (골뱅이 뒤에는 부분만 보기)

		
	}
	
	public static void ex03() {
		
		
		int [] a = new int[5];    
		int [] b;
		
		b = a; 					// a와 b 둘다 참조(주소)가 같음으로 같다.
		
		System.out.println(b[3]);
		
		for(int i = 0;  i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
	}
	
	public static void ex04() {  //심화
		
		//생성된 배열의 크기를 늘이는 방법
		// 기존 배열  
		int [] a = new int [5];
		
		//신규 배열
		int [] b =new int [10];
		
	
		for(int i = 0; i < a.length; i++) {    //각 배열의 값을 넣어주는것
			
			b[i] = a[i];    //b 배열에 a배열 값들을 복사 
		}
		
		// 기존 배열의 참조값을 신규 배열의 참조값으로 수정
		
		a=b;
		
		// 기존 배열이 신규 배열로 변경되었으므로 확인
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	public static void ex08() {
		
		String[] weekName = {"토","일","월","화","수","목","금"};
		
		int day = 13; //13일은 무슨 요일인가
														//배열의 길이 7
		System.out.println(day + "일은"+  weekName[day % weekName.length] + "요일 이다 ");
		
	}
	public static void ex09() {
		
		//연습 봄 여름 가을 겨울
		String[] season = {"겨울","봄", "여름","가을"};
		
		int month = 5; //5월은							1, 2 , 12 나누고난 "나머지"를 3으로 나누면 "몫"이 0 그래서 겨울 
		
		System.out.println(month + "월은" + season[month % 12/ 3]);  //12개월을 3으로 나누면 0 ,1 ,2, 3 등 몫이 나오는걸 이용한것.
				
		
		
	}
	
	
	
	/*
        |-------|
      a | 0x123 |─────┐
        |-------|          │
        |  ...  |          │
        |-------|          │
   a[0] |   0   | 0x123    │
        |-------|          │
   a[1] |   0   |          │
        |-------|          │
   a[2] |   0   |          │ b = a;
        |-------|          │
   a[3] |   0   |          │
        |-------|          │
   a[4] |   0   |          │
        |-------|          │
        |  ...  |          │
        |-------|          │
      b | 0x123 |◀────┘
        |-------|
	*/
	
	
	
	
	
	public static void main(String[] args) {
		ex09();

	}

}
