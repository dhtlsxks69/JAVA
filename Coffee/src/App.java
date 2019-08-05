//싱글톤 패턴

class President {
	
	private static President p = new President();
	
	private President() {
		System.out.println("대통령이 만들어졌습니다.");
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
