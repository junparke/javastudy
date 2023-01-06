package ex02_casting;

public class Ex01_promotion {
	public static void main(String[] args) {
		//자동변환
		//1. 작은 크기 -> 큰 크기
		//2. 정수 -> 실수

		long money = 10000;  //롱은 8자리 인데 money에 4글자리만 저장함으로 작 ->큰 (프로모션) L 붙으면 프로모션 x
		System.out.println(money);
		
		double score = 90; // 정수 90이 실수 90.0으로 promotion
		System.out.println(score);
		
	}

}
