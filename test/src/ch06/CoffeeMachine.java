package ch06;

public class CoffeeMachine {
	
	static  void coffeecheck() {
		System.out.println("���� �۵��ǰ� �ֽ��ϴ�.");
	}
	
	static String coffeeSelect(int money) {
		String coffee = null;  // = null �� �ʱ�ȭ ����� ��
		
		if(money == 300){
			coffee = "�ٹ�Ŀ��";
		}else if(money == 500){
			coffee = "�Ƹ޸�ī��";
		}else if(money == 1000){
			coffee = "ī���ī";
		}
		
		return coffee;
	}
	
	public static void main(String[] args) {
		CoffeeMachine.coffeecheck();
		String coffee = CoffeeMachine.coffeeSelect(500);
		System.out.println(coffee);
	}
}
