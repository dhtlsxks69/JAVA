package test;

public class variableEx2 {
	public static void main(String[] args) {
		double d = 10.5;  //8byte
		int num = 10;  //4byte
		
		//������ ����ȯ(������)
		num = (int)d;
		System.out.println(num);
		
		//������ ����ȯ(�ڵ�����)
		//d = num;
		//System.out.println(d);
		
		byte data = 1;
		
		int n = data;
		
		int k = 10000;  
		
		byte b = (byte)k;
		System.out.println(b);  //ũ�Ⱑ ©���� ���
	}
}