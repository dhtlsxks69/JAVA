//�߻�Ŭ������ �뵵
//������� ��Ȱ�� �Ѵ�.

package test;

interface Nife {
	void attack();
	void cook();
	void slice();
}

abstract class Use implements Nife{
	@Override
	public void attack() {}
	@Override
	public void cook() {}
}

class Chef extends Use{
	@Override
	public void cook() {
		System.out.println("�丮�ϴ�.");
	}
	
	@Override
	public void slice() {
		
	}
}

class Warrior extends Use{
	@Override
	public void attack() {
		System.out.println("�����ϴ�.");
	}
	
	@Override
	public void slice() {
		
	}
}

public class Test {

	public static void main(String[] args) {

	}

}