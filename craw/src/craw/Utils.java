package craw;

public class Utils {
	public static String makeOid(String input){
		int temp = Integer.parseInt(input);
		temp++;
		String s = String.format("%03d", temp);  //0�� �ְ� 3�ڸ� ���ڷ�
		return s;
	}
	
	public static String makeAid(String input){
		int temp = Integer.parseInt(input);
		temp++;
		String s = String.format("%010d", temp);  //0�� �ְ� 10�ڸ� ���ڷ�
		return s;
	}
}
