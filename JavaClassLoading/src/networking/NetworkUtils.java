package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class NetworkUtils {
	public static void getRequest(String sourceUrl) throws IOException {
	
		URL url = new URL(sourceUrl);
		
	    String readLine = null;
	    HttpURLConnection conection = (HttpURLConnection) url.openConnection();
	    conection.setRequestMethod("GET");
	    int responseCode = conection.getResponseCode();
	    
	    if (responseCode == HttpURLConnection.HTTP_OK) {
	        BufferedReader in = new BufferedReader(
	            new InputStreamReader(conection.getInputStream()));
	        StringBuffer response = new StringBuffer();
	        while ((readLine = in.readLine()) != null) {
	            response.append(readLine);
	        } in .close();
	        // print result
	        System.out.println("JSON String Result:");
	        System.out.println(response.toString());
	        //GetAndPost.POSTRequest(response.toString());
	    } else if(responseCode == HttpURLConnection.HTTP_BAD_REQUEST) {
	        System.out.println("4XX.....");
	    }else {
	    	 System.out.println("5XX or else");
	    }
	}
	
	public static void getBooksRequestFromGoogle(String sourceUrl, String value) throws IOException {
		
		URL url = new URL(sourceUrl+value);
		
	    String readLine = null;
	    HttpURLConnection conection = (HttpURLConnection) url.openConnection();
	    conection.setRequestMethod("GET");
	    int responseCode = conection.getResponseCode();
	    
	    if (responseCode == HttpURLConnection.HTTP_OK) {
	        BufferedReader in = new BufferedReader(
	            new InputStreamReader(conection.getInputStream()));
	        StringBuffer response = new StringBuffer();
	        while ((readLine = in.readLine()) != null) {
	            response.append(readLine);
	        } in .close();
	        // print result
	        System.out.println("JSON String Result:");
	        System.out.println(response.toString());
	        //GetAndPost.POSTRequest(response.toString());
	    } else if(responseCode == HttpURLConnection.HTTP_BAD_REQUEST) {
	        System.out.println("4XX.....");
	    }else {
	    	 System.out.println("5XX or else");
	    }
	}
	
}