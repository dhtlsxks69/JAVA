
public class BulgogiBurger {
	
	private int price;
	private String name;
	
	public BulgogiBurger() {
		this(3000, "�Ұ������");
	}
	
	public BulgogiBurger(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}