package ch06;

public class CoffeeMachine {
	
	static  void coffeecheck() {
		System.out.println("정상 작동되고 있습니다.");
	}
	
	static String coffeeSelect(int money) {
		String coffee = null;  // = null 로 초기화 해줘야 함
		
		if(money == 300){
			coffee = "다방커피";
		}else if(money == 500){
			coffee = "아메리카노";
		}else if(money == 1000){
			coffee = "카페모카";
		}
		
		return coffee;
	}
	
	public static void main(String[] args) {
		CoffeeMachine.coffeecheck();
		String coffee = CoffeeMachine.coffeeSelect(500);
		System.out.println(coffee);
	}
}
