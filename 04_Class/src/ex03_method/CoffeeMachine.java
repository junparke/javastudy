package ex03_method;

public class CoffeeMachine {
	
	// 필드값
	
	int moneyPot;
	String[] menu = {"아메리카노", "카페라때","마끼야또"};
	int[] prices = {900, 1500, 2000};
	
	//메소드				커피 가격 , 커피 선택 
	CoffeeAndChange buyCoffee(int money, int choice){
		
		
		//돈이 모자르면 그대로 반환
		int price = prices[choice - 1];
		if(money<price) {
			CoffeeAndChange cnc = new CoffeeAndChange();
			cnc.change = money;
			return cnc;
	}
		
		
		String coffee = menu[choice - 1]; 
		
		moneyPot += price;
		
		CoffeeAndChange cnc = new CoffeeAndChange();
		cnc.coffee = coffee;
		cnc.change = money-=price;
		return cnc;
		
		
		
		
		
	}

}
