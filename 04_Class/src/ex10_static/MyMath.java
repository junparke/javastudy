package ex10_static;

public class MyMath {

	
	
	/*
	   static
	   1. 정적 요소
	   2. 객체 생성 이전에 클래스 영역에 만들어지는 요소(미리만들어진다
	   3. 객체마다 생성되지 않고 클래스 별로 1개씩만 생성됨
	   4. 클래스를 이용해서 호출 하기 때문에 클래스, 클래스 메소드
	   5. static 요소는 다른 static 요소만을 참조할 수 있음.
	   		(non-static 요소는 참조할 수  없음.)
	   
	 */
	
	// 필드   static 은 프라이빗x 공유 해야함으로 public
	public  static final double PI = 3.141592;
	
	//메소드					반지름 = radius
	public static double getCircleArea(double radius) {
		return PI * radius * radius;
	
	}	
	
	
	
	
						//얼마나 올지 모를때
	public static double max(double...numbers) {
		double max = Double.MIN_VALUE; 
		for(int i= 0; i< numbers.length; i++) {
			if(max<numbers[i]) {
				max = numbers[i];
				
			}
		}
		return max;
				}
	
	
	
	//최소값 메소드
	
	public static double min(double...numbers) {
		double min = Double.MAX_VALUE; 
		for(int i= 0; i< numbers.length; i++) {
			if(min>numbers[i]) {
				min = numbers[i];
				
			}
		}
		return min;
				}
	
	
	
	
	
	
}
