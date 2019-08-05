//쓰레드는 타겟이 필요함(메소드)
//타겟은 Runnable 타입이어야 한다.
class Num implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			System.out.println("새로운쓰레드 : " + i);
		}
	}
	
}

//현재 쓰레드는 메인쓰레드 1개!!
public class MainApp {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Num());
		t1.start();
		
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("메인쓰레드 : " + i);
		}
	}
}
