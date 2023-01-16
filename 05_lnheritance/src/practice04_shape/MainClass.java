package practice04_shape;

public class MainClass {

	public static void main(String[] args) {
		
		Shape circle = new Cicle(1.5);
		System.out.println("원 면적 : "+circle.getArea());
		

		Shape rectangle = new Rectangle(1.5, 2.5);
		System.out.println("사각형 면적 : " + rectangle.getArea());
		
		
		
		Shape square = new Square(1.5);
		System.out.println("정사각형 면적 : " + square.getArea());
		
		
		
	}

}
