package ex02_loop;

public class ex05_nested_loop {
	
	
	public static void ex01() {
		
		/*
		for(int day =1; day <= 5; day++) {
			for(int hour =1; hour <= 8; hour++) {
				System.out.println(day + "일차"+ hour + "교시 수업");
			}
			
			
			*/
			
			for(int day = 1; day <=5; day++) {
				for (int hour =1; hour <=8; hour++) {
					System.out.println(day+ "일차" + hour + " 교시 수업");
				}
			}
		}

	
	public static void ex02() {
//		int day = 1;
//		int hour = 1;
//		while(day <= 5 ) {
//			System.out.println(day + "일차");
//		 day++;
//		}
//	
//		while(hour <= 8) {
//			System.out.println(hour + "교시 수업");
//			hour++;
//		}		
		
		
		
		int day =1;
		while(day <= 5) {
			
			int hour =1;
			while(hour <= 8) {
				System.out.println(day + "일차"+ hour + "교시 수업");
				hour++;
			}
			day++;
		}
		
		
		
		
		
		
		
	}
	public static void ex03() {
		//전체 구구단 출력하기
		
		for(int a = 2; a <= 9; a++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println( a + " x " + j + " = "+( a * j ) );
			}
		}
		
	}
	
	public static void ex04() {
		
//		
//		
//		for(int a = 2; a <= 9; a++) {
//			for(int j = 1; j <= 9; j++) {
//				System.out.println( j+ " x " + a + " = "+( j * a ) );
//			}
//		}
		
		for(int n =1; n<= 9 ; n++) {
			for(int dan = 2; dan <= 9; dan++) {
				System.out.print(dan+ "x" + n + "="+( dan * n )+ "\t" );
			}
			System.out.println();
		}
		
		
		
		
	} 
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	ex01();
	}

}
