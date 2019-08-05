import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;

public class MovieApp {
	public static Response2 getMovieList(){
		String url = "https://yts.lt/api/v2/list_movies.json?limit=3&page=1&sort_by=like_count&order_by=desc";

		try {
			URL obj = new URL(url);
			HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
			con.setRequestProperty("User-Agent", "Mozilla/5.0");

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "EUC-KR"));
		
			String input;
			StringBuilder sb = new StringBuilder();

			while ((input = in.readLine()) != null) {
				sb.append(input);
			}
			in.close();

			String jsonString = sb.toString();
			
			Gson gson = new Gson();
			Response2 res = gson.fromJson(jsonString, Response2.class);

			System.out.println(res.status);
			System.out.println(res.data.movies.get(0).title);
			System.out.println(res.data.movies.get(1).title);
			System.out.println(res.data.movies.get(2).title);
			
			return res;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
