package test;

interface People {
	/*
	 * People인터페이스를 구현하면 getName()을 오버라이딩 해야한다.
	 */
	String getName();
}

class Middleline implements People{
	String name = "중선";
	
	@Override
	public String getName() {
		return name;
	}
}

class One implements People{
	String name = "한결";
	
	@Override
	public String getName() {
		return name;
	}
}

public class PeopleApp {
	
	static void start(People p){
		//동적바인딩
		System.out.println(p.getName());
	}
	
	public static void main(String[] args) {
		start(new One());
		start(new Middleline());
	}
}
