package test;

//Zealot 자료형
public class Zealot {
	//상태(변수)
	int attack = 10;
	int armor = 5;
	final String name = "질럿"; //4byte  상수
	int hp = 100;
	int sh = 100;
	
	//행동(메소드)
	static void startAttack(){
		System.out.println("질럿이 공격을 하였습니다.");
	}
}
