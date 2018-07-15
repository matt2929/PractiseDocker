import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

class Runner {
	final static String API2 = "http://localhost:5001/";
	final static String API1 = "http://localhost:5002/";
    public static void main(String[] args){
	ApiCall api = new ApiCall();	
	System.out.println(api.ApiGet(API1)); 
	System.out.println(api.ApiGet(API2));
    }
}
