
public class Lotteria {

	public static void main(String[] args) {
		//�ֹ�
		BulgogiBurger b1  = new BulgogiBurger();
		Coke c1 = new Coke();
		FrechFired f1 = new FrechFired();
		
		System.out.println(b1.getName());
		System.out.println(c1.getName());
		System.out.println(f1.getName());
		
		BulgogiBurgerSet bbs = new BulgogiBurgerSet(new BulgogiBurger(), new Coke(), new FrechFired());
		System.out.println(bbs.getPrice());
		System.out.println(bbs.getName());
	}

}
