import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

class ApiCall {

	public ApiCall(){
	}
	

	public static String ApiGet(String urlstr){
		try {
		URL url = new URL(urlstr);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));
		String read;
		String output="";
		while ((read = br.readLine()) != null) {
			output+=read+"\n";
		}
		conn.disconnect();
		return output;
	  } catch (MalformedURLException e) {
		e.printStackTrace();
		return "Failure to connect!";
	  } catch (IOException e) {
		e.printStackTrace();
		return "Failure to connect!";
	  }
	}
	
}
