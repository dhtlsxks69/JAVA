package test;

public class ForEx1 {
	public static void main(String[] args) {
		//2단을 출력하시오.
//		for (int i = 2; i < 3; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + "*" + j + "=" + i*j);
//			}
//		}
		
		//2단을 출력하시오.
//		for(int i = 1; i<10; i++){
//			System.out.println("2*" + i + "=" + 2*i);
//		}
		
		//2단부터 9단까지 출력하시오.
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
	}
}
