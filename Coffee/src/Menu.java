import java.util.List;

public class Menu {
	private List<String> items;
	
	public Menu(List<String> items) {
		this.items = items;
	}
	
	public String choose(String name) {
		for (String item : items) { //�޴��� �޴��� 4���� forEach�� 4�� ����  (forEach��) 
			if(item.equals(name)) {
				return item;
			}
		}
		
		return null;
	}
}