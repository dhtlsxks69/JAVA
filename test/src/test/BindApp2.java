package test;

interface Animal {
	void sound();
}

class Dog implements Animal{
	//�θ� ���� �Լ��� ������ �ϴ� ���� �������̵��̶�� ��.
	//�θ� ���� �Լ��� ������ ���� �ʾƵ� �������̵�!!
	public void sound(){
		System.out.println("�۸�");
	}
}

class Cat implements Animal{
	public void sound(){
		System.out.println("�߿�");
	}
}

class Fish implements Animal{
	public void sound(){
		System.out.println("��������");
	}
}

public class BindApp2 {
	
	public static void start(Animal a){
		a.sound();
	}
	
	public static void main(String[] args) {
		start(new Fish());
		start(new Cat());
		start(new Dog());
		
//		Animal f = new Fish();
//		f.sound();
//		
//		Animal c = new Cat();
//		c.sound();
//		
//		Animal d = new Dog();
//		d.sound();
	}
}