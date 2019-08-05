//1. ������� Ÿ��(run�޼ҵ�)�� �ʿ���.
//2. Ÿ���� Runnable Ÿ���̾�� ��.
class Car implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			Check.output();
		}
	}
}

//synchronized�� ���ÿ� ������ �ȵǰ� �ϴ� �Լ�
class Check {
	static synchronized void output() {
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
}

// 3. ������ ��ü�� �����ϰ� Ÿ���� ��������.
// 4. start() �޼ҵ� ȣ��(�ý��� �ݹ�)
public class MyApp {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Car());
		t1.start();

		for (int i = 0; i < 300; i++) {
			Check.output();
		}
	}
}