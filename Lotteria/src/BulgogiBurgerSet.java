
public class BulgogiBurgerSet {
	private BulgogiBurger bulgogiBurger;
	private Coke coke;
	private FrechFired frechFired;
	
	public BulgogiBurgerSet(BulgogiBurger bulgogiBurger, Coke coke, FrechFired frechFired) {
		super();
		this.bulgogiBurger = bulgogiBurger;
		this.coke = coke;
		this.frechFired = frechFired;
	}
	
	public int getPrice() {
		int price = bulgogiBurger.getPrice() + coke.getPrice() + frechFired.getPrice() - 1000;
		return price;
	}
	
	public String getName() {
		StringBuilder sb = new StringBuilder();
		sb.append(bulgogiBurger.getName()+" ");
		sb.append(coke.getName()+" ");
		sb.append(frechFired.getName()+" ");
		
		return sb.toString();
	}
	
}