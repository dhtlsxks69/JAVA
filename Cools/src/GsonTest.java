import com.google.gson.Gson;

class Animal {
	String name;
	String color;
	String sound;
}

public class GsonTest {
	
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.name = "����";
		a1.color = "����";
		a1.sound = "����";
		
		Gson gson = new Gson();
		String jsonString = gson.toJson(a1);
		System.out.println(jsonString);
		
		Animal aaa = gson.fromJson(jsonString, Animal.class);
		System.out.println(aaa.name);
		System.out.println(aaa.color);
		System.out.println(aaa.sound);
	}
}
