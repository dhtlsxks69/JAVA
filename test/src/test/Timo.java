package test;

public class Timo {
	final String name = "Ƽ��";
	String username;
	static int attack;
	int armor;
	String spell;
	
	public Timo(){
		//�����ڰ� �̹� �����Ǿ� �־ ������ �ȵǱ� ������ �ϳ� �� ����� �ִµ� �����ڴ� ������� �ʴ´�.
	}
	
	//������ (�⺻�����ڴ� �����Ǿ� �ִ�.)
	//this�� ��ü�� ��� �ִ� ����
	public Timo(String username, int attack, int armor, String spell){
		this.username = username;
//		this.attack = attack;
		Timo.attack = attack;
		this.armor = armor;
		this.spell = spell;
	}
}