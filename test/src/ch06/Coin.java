package ch06;

public class Coin {
	
	
	//2��°���
//	final int money = 2680; //���
//	int rest_money = money;  //������ �ʱ�ȭ
//	int count;  //������ ����
//	
	static void start(int coin){
		//1��° ���
		final int money = 2680; //���
		int rest_money = money;  //������ �ʱ�ȭ
		int count;  //������ ����
		
		count = rest_money / coin;
		System.out.println(coin + "�� : "+count);
		rest_money = rest_money%coin;
		System.out.println("�����ݾ� : "+rest_money);
		
	}
	
	public static void main(String[] args) {
		Coin c = new Coin();
		
		c.start(500);
		c.start(100);
		c.start(50);
		c.start(10);
	}
}
