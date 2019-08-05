import java.util.ArrayList;
import java.util.List;

public class Barista {
	//커피를 만들어라
	public Coffee makeCoffee(String name) {
		Coffee coffee = new Coffee(name);
		return coffee;
	}
	
	//메뉴를 만들어라
	public Menu makeMenu(){
		List<String> list = new ArrayList<>();
		list.add(CoffeeList.AMERICANO);
		list.add(CoffeeList.CAFERATTE);
		list.add(CoffeeList.MACIYATO);
		list.add(CoffeeList.CAFEMOCA);
		
		Menu menu = new Menu(list);
		
		return menu;
	}
}
