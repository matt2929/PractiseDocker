import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;
import java.net.*;
import java.util.*;

class ApiCall {

	public ApiCall(){
	}
	

	public static String get(String urlstr){
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
			output+=read;
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

	public static String post(String urlstr, Map<String, Object> params){
		try{
		URL url = new URL(urlstr);
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		StringBuilder postData = new StringBuilder();
		for(Map.Entry<String,Object> param : params.entrySet()){
			if(postData.length() != 0) 
				postData.append('&');
			postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
			postData.append('=');
			postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
		}
		byte[] postDataBytes = postData.toString().getBytes("UTF-8");
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		conn.setDoOutput(true);
		conn.getOutputStream().write(postDataBytes);
		Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
		String output="";
		for(int c; (c = in.read()) >= 0;)
			output+=""+((char)c);
		return output;
		}catch(IOException e){
		return "Failure to connect!";		
		}
	}	
		
}
