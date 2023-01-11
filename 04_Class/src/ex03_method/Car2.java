package ex03_method;

public class Car2 {
	//필드
	int carSped;
	int oilPot;
	
	
	void oilAdd(int oil) {
		if(oilPot + oil > 50) {
			oilPot = 50;
			return;
		}
		oilPot+=oil;				
	}

	
	void pushAccel() {
		if(oilPot == 0) {
			return;			
		}
		oilPot --;
		
		if(carSped + 10 > 100) {
			carSped = 100;
			return;
		}
		carSped += 10;
		
	}
	void pushBreak() {
		if(carSped == 0) {
			return;
		}
		carSped-= 10;
		if(carSped  < 0 ) {
			carSped = 0;
		}
		
		
		
		
	}
	
	

}
