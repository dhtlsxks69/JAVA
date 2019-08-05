package craw;

public class Utils {
	public static String makeOid(String input){
		int temp = Integer.parseInt(input);
		temp++;
		String s = String.format("%03d", temp);  //0을 주고 3자리 숫자로
		return s;
	}
	
	public static String makeAid(String input){
		int temp = Integer.parseInt(input);
		temp++;
		String s = String.format("%010d", temp);  //0을 주고 10자리 숫자로
		return s;
	}
}
