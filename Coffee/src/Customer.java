
public class Customer {
	public void order(String name, Menu menu, Barista barista, Cashier cashier) {
		
		//�޴��׸��� ã�ƶ�
		String menuItem = menu.choose(name);
		if(menuItem == null) {
			System.out.println("ã�� �޴��� �����ϴ�.");
		}
		//Ŀ�Ǹ� ������.
		Coffee coffee = cashier.completeOrder(menuItem, barista);
		
		System.out.println("Ŀ�Ǹ� �޾ҽ��ϴ�.");
		System.out.println("Ŀ���̸� : " + coffee.getName());
	}
}
