package test;

public class OidTest {
	
	public static String makeNumber(String input){
		//1. oid�� �ӽú��� int temp�� ���
		int temp = Integer.parseInt(input);
		
		//2. temp�� 1���� ��Ű��
		temp++;
		//len�� 0�� ����
		int len = input.length() - (temp+"").length();
		String zero = "";
		for(int i = 0; i<len; i++){
			zero += "0";
		}
		
		//3. oid�� "00" + temp = 002 ���� �ְ�
		input = zero + temp;
		
		//4. oid�� return �ϸ� ��.
		return input;
	}
	
	public static String makeNumber2(String input){
		int temp = Integer.parseInt(input);
		temp++;
		String s = String.format("%03d", temp);
		return s;
	}
	
	public static void main(String[] args) {
		String oid = makeNumber("012");
		System.out.println(oid);
		String s = makeNumber2("23");
		System.out.println(s);
	}
}