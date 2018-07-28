import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

class Runner {
	static Controller controller;	
	public static void main(String[] args){
	controller = new Controller();
	controller.start();
    	}

}

