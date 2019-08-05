//추상클래스의 용도
//어댑터의 역활을 한다.

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
		System.out.println("요리하다.");
	}
	
	@Override
	public void slice() {
		
	}
}

class Warrior extends Use{
	@Override
	public void attack() {
		System.out.println("공격하다.");
	}
	
	@Override
	public void slice() {
		
	}
}

public class Test {

	public static void main(String[] args) {

	}

}
