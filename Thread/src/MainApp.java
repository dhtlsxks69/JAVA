//������� Ÿ���� �ʿ���(�޼ҵ�)
//Ÿ���� Runnable Ÿ���̾�� �Ѵ�.
class Num implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			System.out.println("���ο���� : " + i);
		}
	}
	
}

//���� ������� ���ξ����� 1��!!
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
			System.out.println("���ξ����� : " + i);
		}
	}
}
