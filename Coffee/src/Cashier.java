import java.util.ArrayList;

public class Cashier {
	ArrayList<String> orderList = new ArrayList<>();
	
	public Coffee completeOrder(String menuItem, Barista barista){
	//주문목록
	orderList.add(menuItem);
	
	//커피를 생성하라.
	Coffee coffee = barista.makeCoffee(menuItem);
	
	return coffee;
	}
}
