package pactice_BankAccount;

public class BankAccount {

	//필드
	private String accNo;
	private long balance;
	
	
//생성자  퍼블릭 붙이고 클래스 이름
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	
	
	//메소드(입금, 출금, 이체, 조회)\ 메소드는 퍼블릭처리
	
	//입금(마이너스 입금 불가 처리)
	public void deposit(long money) {
		if( money <= 0) {
			return;  //메서드 종료. 오직 반환이 void인 경우에만 사용가능.
		}
		balance += money;
		
	}
	
	
	
	// 출금 (마이너스 출금 + 잔액보다 큰 출금 불가 처리)
	public long withdrawal(long money){
		if (money <= 0 ||  balance < money) {
			return 0; //void가 아닐경우 리턴 값을 붙여서 종료해야함!!
		}
		balance-=money;  //계좌 돈 빠져나감
		return money;  //요청한 돈 그대로 돌아가기
	}
	
	//이체 (누구에게 얼마)
	public void transfer(BankAccount other, long money) {
		//1.내 통장에서 money 출금 :(이름같을때는디스 this.)withdrawal(money)
		//2. 상대 통장에 실제로 내 통장에서 출금된 금액 입급 : other.deposit(withdrawal(money))
								//내 통장에서 출근된 금액이 상대편 통장에 입급
		
		
		other.deposit(withdrawal(money));
		
	}
	
	
	//조회
	public void inquiry() {
		System.out.println("계좌 번호 : "+ accNo);
		System.out.println("잔액 : " + balance);
	}	

	
	
	
	
}
