package craw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class CrawApp {
	public static void main(String[] args) {
		startCraw();
	}
	public static void startCraw() {

		String oid = "001";
		String aid = "0000000501";

		while (true) {
			if(aid.equals("0100000000")) break;
			String url = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=100&oid=" + oid + "&aid=" + aid;

			try {
				URL obj = new URL(url);
				HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

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

				if(result.contains("����")){
					System.out.println(result);
					System.out.println(url);
				}
			} catch (Exception e) {

			}

			// 1���� ���Ѿ���.
			// static�޼ҵ� ȣ��
			oid = Utils.makeOid(oid);
			aid = Utils.makeAid(aid);
		}
	}
}