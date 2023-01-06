package Ex03_parsing;

public class Mainclass {

	public static void main(String[] args) {
		// 구문 분석(parsing)
		// 문자열을 기본타입으로 변환하는 과정 
		
		String strScore = "90";
		String strMoney = "100000000";
		String strEye = "0.7";
			
		//string -> int 변환
	int score = Integer.parseInt(strScore);
	 System.out.println(score);
	 
	 //string -> long 으로 변환
	 long money = Long.parseLong(strMoney);
	 System.out.println(money); 
	 
	 //string -> double 으로 변환
	 double eye = Double.parseDouble(strEye);
	 System.out.println(eye);
	}

}
