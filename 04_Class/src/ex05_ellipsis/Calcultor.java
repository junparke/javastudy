package ex05_ellipsis;

import javax.swing.text.rtf.RTFEditorKit;

public class Calcultor {

	
	
	/*
	   매개변수 생략 
	   1. 전달되는 인수의 개수가 정해지지 않은 경우에 사용한다.
	   2. 말 줄임표(...)를 활용한다.
	   3. 실제로는 배열로 처리된다.	   
	 */
				// 넘버즈 라는 배열로 처리
	double addition(double... numbers) {
		double total = 0.0;   // 토탈 합 
		for(int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}
	

	
}
