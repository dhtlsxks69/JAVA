package test;

public class Coin {
	public static void main(String[] args) {
		//연산자 활용과 변수의 이해 500, 100, 50, 10
		final int money = 2680; //상수
		int rest_money = money;  //변수의 초기화
		int count;  //변수의 선언
		
		count = rest_money / 500;
		System.out.println("500원 : "+count);
		rest_money = rest_money%500;
		System.out.println("남은금액 : "+rest_money);
		
		count = rest_money / 100;
		System.out.println("100원 : "+count);
		rest_money = rest_money - (100*count);
		System.out.println("남은금액 : "+rest_money);
		
		count = rest_money / 50;
		System.out.println("50원 : "+count);
		rest_money = rest_money - (50*count);
		System.out.println("남은금액 : "+rest_money);
		
		count = rest_money / 10;
		System.out.println("10원 : "+count);
		rest_money = rest_money - (10*count);
		System.out.println("남은금액 : "+rest_money);
	}
}
