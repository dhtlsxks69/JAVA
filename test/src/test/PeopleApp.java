package test;

interface People {
	/*
	 * People�������̽��� �����ϸ� getName()�� �������̵� �ؾ��Ѵ�.
	 */
	String getName();
}

class Middleline implements People{
	String name = "�߼�";
	
	@Override
	public String getName() {
		return name;
	}
}

class One implements People{
	String name = "�Ѱ�";
	
	@Override
	public String getName() {
		return name;
	}
}

public class PeopleApp {
	
	static void start(People p){
		//�������ε�
		System.out.println(p.getName());
	}
	
	public static void main(String[] args) {
		start(new One());
		start(new Middleline());
	}
}
