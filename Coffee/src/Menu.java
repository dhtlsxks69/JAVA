import java.util.List;

public class Menu {
	private List<String> items;
	
	public Menu(List<String> items) {
		this.items = items;
	}
	
	public String choose(String name) {
		for (String item : items) { //메뉴에 메뉴가 4개면 forEach문 4번 실행  (forEach문) 
			if(item.equals(name)) {
				return item;
			}
		}
		
		return null;
	}
}
