import java.util.ArrayList;

public class Box2<T> {
	private T name;

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Box2<String> b = new Box2<>();
		b.setName("�ȳ�");
		System.out.println(b.getName());
		
		ArrayList<Box> ab = new ArrayList<>();
	}	
}
