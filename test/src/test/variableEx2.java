package test;

public class variableEx2 {
	public static void main(String[] args) {
		double d = 10.5;  //8byte
		int num = 10;  //4byte
		
		//명시적 형변환(강제로)
		num = (int)d;
		System.out.println(num);
		
		//묵시적 형변환(자동으로)
		//d = num;
		//System.out.println(d);
		
		byte data = 1;
		
		int n = data;
		
		int k = 10000;  
		
		byte b = (byte)k;
		System.out.println(b);  //크기가 짤려서 출력
	}
}
