
public class MainApp {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Barista barista = new Barista();
		Cashier cashier = new Cashier();
		Menu menu = barista.makeMenu();
		
		//커피를 주문하라!!
		customer.order(CoffeeList.CAFEMOCA, menu, barista, cashier);
		customer.order(CoffeeList.AMERICANO, menu, barista, cashier);
		
		System.out.println();
		System.out.println("===주문목록===");
		for(String item : cashier.orderList) {
			System.out.println(item);
		}
	}
}
