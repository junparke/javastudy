package ex04_op_number;

public class MainClass {
	//ex01 메소드 정의
	public static void ex01() {
		int a = 5;
		int b = 2;
		
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;//몫
		int mod = a % b;//나머지
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div); //몫
		System.out.println(mod); //나머지
		
	}
	//ex02메소드 정의
	public static void ex02() {
		int a = 5;
		int b = 2;
		
		double div = (double)a/b;
		System.out.println(div);
	}
	public static void ex03() {
		int second = 90;
	}

	
	public static void ex04() {
		// 1증가 : ++
		// 1 감소 : --
		
		//전위 연산자
		//++a 또는 --a
		//변수 a의 값을 1 증가(감소) 시킨 뒤 사용
		
		int a= 10;
		System.out.println(++a);
		
		//후위 연산자
		//b++ 또는 b--
		//뱐수 b의 값을 사용한 뒤에 1을 증가(또는 감소)
		
		int b= 10;
		System.out.println(b++);
		System.out.println(b);
	}
	
	public static void ex05() {
		// 대입 연산
		// 등호(=) 의 오른쪽 값을 왼쪽으로 보내는 연산
		int a;
		a =10;
		System.out.println(a);
	}
	//06 메소드 정의
	public static void ex06() {
		int x = 10;
		int y = 20;
		
		//교환
		int temp;
		temp = x;
		x=y;
		y = temp;
		
		
		
		
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		ex06(); //ex03 메소드를 호출하겠다
		
		
	}

}
