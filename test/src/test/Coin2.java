package test;

public class Coin2 {
	public static void main(String[] args) {
		// ������ Ȱ��� ������ ���� 500, 100, 50, 10
		final int money = 2680; // ���
		int rest_money = money; // ������ �ʱ�ȭ
		int count; // ������ ����
		
		int arr[] = {500,100,50,10};
		
		for (int i = 0; i < arr.length; i++) {
			count = rest_money / arr[i];
			System.out.println(arr[i] + "�� : " + count);
			rest_money = rest_money % arr[i];
			System.out.println("�����ݾ� : " + rest_money);
		}
	}
}
