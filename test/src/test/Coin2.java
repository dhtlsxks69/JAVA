package test;

public class Coin2 {
	public static void main(String[] args) {
		// 연산자 활용과 변수의 이해 500, 100, 50, 10
		final int money = 2680; // 상수
		int rest_money = money; // 변수의 초기화
		int count; // 변수의 선언
		
		int arr[] = {500,100,50,10};
		
		for (int i = 0; i < arr.length; i++) {
			count = rest_money / arr[i];
			System.out.println(arr[i] + "원 : " + count);
			rest_money = rest_money % arr[i];
			System.out.println("남은금액 : " + rest_money);
		}
	}
}
