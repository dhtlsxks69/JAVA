
public class Coke {
	
	private int price;
	private String name;
	
	public Coke() {
		this(1000, "�ݶ�");
	}
	
	public Coke(int price, String name) {
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