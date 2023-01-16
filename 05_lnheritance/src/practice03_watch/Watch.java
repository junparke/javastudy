package practice03_watch;

public class Watch {
	// 필드
		private int hour;  // 0 ~ 23
		private int minute;  // 0 ~ 59
		private int second;  // 0 ~ 59
		
		// 생성자
		public Watch(int hour, int minute, int second) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
		
		// 메소드
	public void addHour(int hour){
		if(hour < 0) {
			return;
		}
		this.hour += hour;
		this.hour %= 24;
		
	}
	
	
	public void addMinute(int minute){
		if(minute < 0) {
			return;
		}
			this.minute += minute;
			this.minute %= 60;
			addHour(this.minute /60);
		
	}	
		
	
	public void addSecond(){
		
		
	}	
	
}
