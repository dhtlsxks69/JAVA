//String, char, int
public class Box {
	private Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
	
	public static void main(String[] args) {
		Box b = new Box();
		b.setItem(3);
		System.out.println((int)b.getItem());
		b.setItem("�ȳ�");
		System.out.println((String)b.getItem());
		b.setItem('��');
		System.out.println((char)b.getItem());
		b.setItem(5.7);
		System.out.println((double)b.getItem());
		
	}
	
}
