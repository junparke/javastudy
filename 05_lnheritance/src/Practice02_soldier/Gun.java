package Practice02_soldier;

/*
  		has a 관계
  		1. 상속 관계로 만들수 있는 관계이다.
  		2. Soldier has a Gun
  		3. 자식 has a 부모
 */



public class Gun  {

	
		
	//필드
	private String model;
	private int bullet;
	private final int Max_BULLET= 20;
	
	
	//메소드
	
	
	public String getModel() {
		return model;
	}
	
	
	public void setModel(String model) {
		this.model = model;
	}
	
	
	public int getBullet() {
		return bullet;
	}
	
	
	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
	//총알 넣기 
	public void reload(int bullet) {
		if(this.bullet == Max_BULLET ) {
			
			return ;
		}
		this.bullet+= bullet;
		this.bullet = (this.bullet > Max_BULLET)? Max_BULLET : this.bullet;
	}
	
	
	
	//총쏘기
			
		public void shoot()  {
		
		if(this.bullet  == 0) {
			System.out.println("헛빵");
			return;
		}
		bullet --;
		System.out.println("빵");
	}

	
	
}
