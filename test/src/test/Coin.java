package test;

public class Coin {
	public static void main(String[] args) {
		//������ Ȱ��� ������ ���� 500, 100, 50, 10
		final int money = 2680; //���
		int rest_money = money;  //������ �ʱ�ȭ
		int count;  //������ ����
		
		count = rest_money / 500;
		System.out.println("500�� : "+count);
		rest_money = rest_money%500;
		System.out.println("�����ݾ� : "+rest_money);
		
		count = rest_money / 100;
		System.out.println("100�� : "+count);
		rest_money = rest_money - (100*count);
		System.out.println("�����ݾ� : "+rest_money);
		
		count = rest_money / 50;
		System.out.println("50�� : "+count);
		rest_money = rest_money - (50*count);
		System.out.println("�����ݾ� : "+rest_money);
		
		count = rest_money / 10;
		System.out.println("10�� : "+count);
		rest_money = rest_money - (10*count);
		System.out.println("�����ݾ� : "+rest_money);
	}
}