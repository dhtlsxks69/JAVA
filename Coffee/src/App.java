//�̱��� ����

class President {
	
	private static President p = new President();
	
	private President() {
		System.out.println("������� ����������ϴ�.");
	}
	
	public static President getInstance(){
		return p;
	}
}

public class App {	
	public static void main(String[] args) {
		President p = President.getInstance();
	}
}
