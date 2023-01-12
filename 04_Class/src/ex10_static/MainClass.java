package ex10_static;

public class MainClass {

	public static void main(String[] args) {
		
		//static 요소는 객체를 이용해서 호출 할수있으나, 권장 하지 않는다.
		
		MyMath mayMayh = new MyMath();
		System.out.println(MyMath.PI);
		
	
		MyMath yourMath = new MyMath();
		System.out.println(yourMath.PI);
	
		
		//static 요소는 클래스를 이용해서 호출하는 것이 권장이다.
		System.out.println(MyMath.PI);
		System.out.println(MyMath.getCircleArea(4));
		
		
		System.out.println(MyMath.max(1.1, 2.2, 3.3));
		System.out.println(MyMath.max(1.1, 2.2, 3.3,4.4));
		System.out.println(MyMath.max(1.1, 2.2, 3.3,4.4, 5.5));
		
		
		System.out.println(MyMath.min(1.1, 2.2, 3.3));
		System.out.println(MyMath.min(1.0, 2.2, 3.3,4.4));
		System.out.println(MyMath.min(0.5, 2.2, 3.3,4.4, 5.5));
		

		
		
	}

}
