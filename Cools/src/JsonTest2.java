import org.json.simple.JSONObject;

class Data {
	int movie_count = 12499;
	int limit = 3;
	int page_number = 1;
}

class Respnse {
	String status = "ok";
	String status_message = "query was success";
	Data data = new Data();
}

public class JsonTest2 {
	
	public static void main(String[] args) {
		JSONObject js = new JSONObject();
		js.put("status", "ok");
		js.put("status_message", "query was success");
		
		JSONObject data = new JSONObject();
		data.put("movie_count", 12499);
		data.put("limit", 3);
		data.put("page_number", 1);
		
		js.put("data", data);
		
		System.out.println(js);
	}
}
