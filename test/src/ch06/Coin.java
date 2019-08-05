package ch06;

public class Coin {
	
	
	//2번째방법
//	final int money = 2680; //상수
//	int rest_money = money;  //변수의 초기화
//	int count;  //변수의 선언
//	
	static void start(int coin){
		//1번째 방법
		final int money = 2680; //상수
		int rest_money = money;  //변수의 초기화
		int count;  //변수의 선언
		
		count = rest_money / coin;
		System.out.println(coin + "원 : "+count);
		rest_money = rest_money%coin;
		System.out.println("남은금액 : "+rest_money);
		
	}
	
	public static void main(String[] args) {
		Coin c = new Coin();
		
		c.start(500);
		c.start(100);
		c.start(50);
		c.start(10);
	}
}
