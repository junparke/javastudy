package ex03_method;

public class Car {

	//필드
	int oilpot;
	int carSpeed; //pushAccel 마다 속도는 10씩 증가, 최대 속도100, pushBrake 마다 10씩 감소

	
	
	//기름 넣기 메소드
	void addoil(int oil) {
		if(oilpot + oil > 50) {
			oilpot = 50;
			return; // 메소드를 종료하시오. 반환타입이 void 인 경우에만 사용 가능
		}
		oilpot += oil;
	}	
	
	//달리기 메소드
		void pushAccel() {
			if(oilpot== 0) {
				return;				
			}
			oilpot--;		//속도가 최대여도 기름은 계속 줄은다
			
			if(carSpeed + 10 > 100) {     //만약 차 속도가 100보다 밑이면 100으로 하자
				carSpeed = 100;
				return;
			}
								
			carSpeed += 10;						
		
		}
	
	//멈추기 메소드
		
		void pushBrake() {
			
			if(carSpeed == 0){   // 차 스피드가 0일때 종료
				return;
			}
			carSpeed -= 10;
			if(carSpeed < 0) {		//차스피드가 0 보다 낮을때는 0으로 하자
				carSpeed = 0;
			}
	
			
		}
	
	
	
	
}

	