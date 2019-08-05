
public class Customer {
	public void order(String name, Menu menu, Barista barista, Cashier cashier) {
		
		//메뉴항목을 찾아라
		String menuItem = menu.choose(name);
		if(menuItem == null) {
			System.out.println("찾는 메뉴가 없습니다.");
		}
		//커피를 만들어라.
		Coffee coffee = cashier.completeOrder(menuItem, barista);
		
		System.out.println("커피를 받았습니다.");
		System.out.println("커피이름 : " + coffee.getName());
	}
}
