package ex08_interface;

public interface Person {
	
	/*
	  인터페이스(interface)
	  1.추상 클래스의 한 형태이다.
	  2.jdk 1.7 이전에는 추상 메소드로만 구성된 추상 클래스를 의미한다.
	  3.jdk 1.8 이후에는 본문이 있는 default 메소드, static 메소드를 추가할수있다. 
	  4. 인터페이스는 주로 final 상수, 추상 메소드를 가진다.
	  5. 인터페이스의 추상 메소드는 public abstract를 모두 생량할수있다.
	 */
	
	
	
	public default void eat() {
		System.out.println("먹는다");
	}
	
	
	public default void sleep() {
		System.out.println("잔다");
	}

	
	public void study();
	
	
}
