package ex05_ellipsis;

public class MainClss {

	public static void main(String[] args) {
			
		
		// calcultor 객체 생성
		
		Calcultor calc = new Calcultor();
		
		System.out.println(calc.addition(1.1, 2.2));
		System.out.println(calc.addition(1.1, 2.2, 3.3));
		System.out.println(calc.addition(1.1, 2.2, 3.3, 4.4));
		System.out.println(calc.addition(1.1, 2.2, 3.3, 4.4, 5.5));
		

	}

}
