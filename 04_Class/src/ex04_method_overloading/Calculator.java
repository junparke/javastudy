package ex04_method_overloading;

public class Calculator {
	
	/*
	   메소드 오버로딩
	   1. 같은 이름의 메소드를 여러개 만들수 있다.
	   2. 제한 조건
	   		1) 메소드 이름 같아야함
	   		2) 매개변수의 타입이나 개수가 달라야함
	   		3) 주의) 반환타입은 메소드 오버로딩과 연관 없다.
	   
	   
	 */
	

		double addition(double a, Double b) {
			return a + b ;
		}
	
		
		
	double addition(double[] numbers) {
		double total = 0.0;
		for (int i= 0; i < numbers.length; i++) {
			total += numbers[i];
	}
			return total;
		
			
			
			

	}
		
		
	
		
}
