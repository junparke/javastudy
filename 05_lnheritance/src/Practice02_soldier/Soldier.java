package Practice02_soldier;

public class Soldier {
	
	//필드
	private Gun gun;   //초기값은 null
	
	
	//생성자
	public Soldier() {
		gun = new Gun();   //상속 으로 안할때는 이렇게 생성자를 직접 넣어줘야한다		
	}
	
	
	
	//메소드
	
	
	public void reload(int bullet) {
		gun.reload(bullet);
	}
	
	
	public void shoot() {
		gun.shoot();
	}
	
	
	
	
}
