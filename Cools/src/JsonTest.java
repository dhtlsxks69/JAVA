import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

class Info {
	String name = "������";
	String phone = "01023548424";
}

class Account {
	String account = "172-2034-22";
	String password = "1234";
	
	Info info = new Info();
	
	String time[] = {"2019-07-01", "2019-07-03"};
}

public class JsonTest {

	public static void main(String[] args) {
		String jsonString = "{\"account\":\"172-2034-22\", \"password\":1234, \"info\":{\"name\":\"������\", \"phone\":\"01023548424\"}, time:[\"2019-07-01\", \"2019-07-03\"]}";
		System.out.println(jsonString);
		
		JSONObject js = new JSONObject();
		js.put("account", "172-2034-22");
		js.put("password", 1234);
		
		JSONObject info = new JSONObject();
		info.put("name", "������");
		info.put("phone", "01023548424");
		
		js.put("info", info);
		
		JSONArray arr = new JSONArray();
		arr.add("2019-07-01");
		arr.add("2019-07-03");
		js.put("date", arr);
		
		System.out.println(js);
		
	}

}
