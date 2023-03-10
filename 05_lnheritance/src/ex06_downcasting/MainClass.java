package ex06_downcasting;

public class MainClass {

	public static void ex01() {
		//upcasting
		Person person = new Student();
		
		//downcasting
		Student student = (Student)person;
		
		student.eat();
		student.sleep();
		student.study();
		
		
	}
	
	public static void ex02() {
	
			//person
			Person person = new Person();
			
			//잘못된 캐스팅
			Student student = (Student)person;
			
			//잘못된 캐스팅은 컴파일 오류로 걸려지지 않는다.
			student.eat();
			student.sleep();
			student.study();     //오류 발생 부분
	}
	
	public static void ex03() {
		//person
		Person person = new Person();
		
		//Student 객체(인스턴스 instance)가 맞다면 student 타입으로 캐스팅 하자.
		if(person instanceof Student) {
			Student student = (Student)person;
			student.eat();
			student.sleep();
			student.study();
			
			
			person.eat();
			person.sleep();
			((Student)person).study();   //이렇게 해주면 좋다
			
		
		}
		
		
	}
	public static void main(String[] args) {
	ex03();

	}

}
