import java.util.ArrayList;

public class Cashier {
	ArrayList<String> orderList = new ArrayList<>();
	
	public Coffee completeOrder(String menuItem, Barista barista){
	//�ֹ����
	orderList.add(menuItem);
	
	//Ŀ�Ǹ� �����϶�.
	Coffee coffee = barista.makeCoffee(menuItem);
	
	return coffee;
	}
}
