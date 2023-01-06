package ex05_op_condition;

public class MainClass {
	public static void main(String[] args) {
//
//		//논리 연산
//		//1. 논리 AND : &&, 모든조건이 true 이면 true, 아니면 false
//		//2. 논리 OR  : ||, 하나의 조건이라도 true 이면 true, 아니면 false
//		//3. 논리 not : !, 조건이 true 이면 false, 조건이 fals이면 true
//		
//		int a = 10;
//		int b = 10;
//		
//		boolean result1 = (a == 10) && (b==10);
//		boolean result2 = (a==10) &&(b == 20);
//		
//		System.out.println(result1);
//		System.out.println(result2);
//		
//		boolean result3 = (a == 10) || (b == 10);
//		boolean result4 = (a == 10) || (b== 20);
//		System.out.println(result3);
//		System.out.println(result4);
//		
//		
//		boolean result5 = !(a == 10);
//		boolean result6 = !(a == 20);
//	
//		System.out.println(result5);
//		System.out.println(result6);
		
		//====================================================================
		//Short Circuit Evaluation
		//1.논리 ADN의 경우 조건의 결과가 false인 경우가 발생하면 더이상 동작 하지 않는다. 최종결과가 false로 정해졌기 때문이다.
		//2. 논리 OR의 경우 조건의 결과가 turue인 경우가 발생하면 더이상 동작 하지 않는다. 최종결과가 false로 정해졌기 때문이다.
		
//		
//		int a =10;
//		int b =10;
//		
//		boolean result1 = (a == 20) && (++b ==11);
//		System.out.println(b);
//		System.out.println(result1);
//		
//		boolean result2 = (a == 10) && (++b ==11);
//	
//		System.out.println(b);
//		System.out.println(result2);
		
//		
//		int score = 75;
//		boolean result = (score >= 70 )&&(score <80);  //70점대는 true 아니면 false
//		System.out.println(result);
//		
//		boolean result2 = (score/10) == 7;
//		System.out.println(result2);
		
		//=========================================================
		//조건 연산자
		//조건자 ? true 일 때 처리 : false 일 때 처리
//		
//		int score = 50;
//	//70점 이상 합겹
//		String result = (score>=70)?"합격":"불합격";
//		System.out.println(result);
//		
		
		
		
//		3의 배수인가 짝수인가
		int n =4;
		
		String result = (n!=0 && n % 3==0)?"3의배수입니다" :(n%2==0)?"짝수입니다":"홀수";
		System.out.println(result);
		
		
		
		
	}

	
}
