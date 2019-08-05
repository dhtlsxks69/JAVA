package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DownloadTest {
	public static void main(String[] args) {
		String url = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=100&oid=023&aid=0003458821";
		
		try {
			URL obj = new URL(url);
			//SSL이 적용된 사이트
			HttpsURLConnection con = (HttpsURLConnection)obj.openConnection();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "EUC-KR"));
			
			String input;
			StringBuilder sb = new StringBuilder();
			
			while ((input = in.readLine()) != null) {
				sb.append(input);
			}
			in.close();
			
			String html = sb.toString();
			
			Document doc = Jsoup.parse(html);
			
			Elements el = doc.select("#articleTitle");
			String result = el.get(0).text();
			System.out.println(result);
		} catch (Exception e) {
			
		}
	}
}
