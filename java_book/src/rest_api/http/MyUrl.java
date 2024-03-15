package rest_api.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MyUrl {

	public static void main(String[] args) {

		String url = "https://www.kobis.or.kr/kobisopenapi/homepg/board/findServiceGuideList.do";
		System.out.println(httpGetRequest(url));
	}

	public static String httpGetRequest(String urlstr) {
		
		BufferedReader in = null;
		StringBuilder sb = new StringBuilder();

		try {
			URL obj = new URL(urlstr); // 호출할 url
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			con.setRequestMethod("GET");

			in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

			String line;
			while ((line = in.readLine()) != null) { // response를 차례대로 출력
				sb.append(line+"\n");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		return sb.toString();
	}
}
