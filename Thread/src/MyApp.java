//1. 쓰레드는 타겟(run메소드)가 필요함.
//2. 타겟은 Runnable 타입이어야 함.
class Car implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			Check.output();
		}
	}
}

//synchronized는 동시에 실행이 안되게 하는 함수
class Check {
	static synchronized void output() {
		System.out.println("출금이 완료되었습니다.");
	}
}

// 3. 쓰레드 객체를 생성하고 타겟을 지정해줌.
// 4. start() 메소드 호출(시스템 콜백)
public class MyApp {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Car());
		t1.start();

		for (int i = 0; i < 300; i++) {
			Check.output();
		}
	}
}
