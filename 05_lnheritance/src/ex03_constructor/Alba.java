package ex03_constructor;

public class Alba extends Student{

	public Alba() {
		super();
	}
	
	//필드
	
		private String company;
		 
		//생성자
		
		
		public Alba(String name, String school, String company) {
			super(name, school);
			this.company = company;
		}

		
		
		
		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}
		

		
		
		//메소드
		
		

}
