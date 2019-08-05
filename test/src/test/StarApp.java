package test;

public class StarApp {
	public static void main(String[] args) {
		Zealot.startAttack();
		//new 지금 메모리에 할당(allocate)
		Zealot z1 = new Zealot();
		
		//공격력 증가
		z1.attack = z1.attack + 1;
		
		System.out.println(z1.attack);
		
		//이름변경
		//z1.name = "드라군";
		
		//공격
//		z1.startAttack();
	}
}
