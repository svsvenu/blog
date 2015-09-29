package com.venu.cache.jdg;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class SaveToJDG {
	
	private static String restUrl = "http://localhost:8081/rest/teams";
	
	public static void writeToCache(String key, String value) {
		
		try{
		URL url = new URL(restUrl + "/" + key);
		HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
		httpCon.setDoOutput(true);
		httpCon.setRequestProperty("Content-Type", "text/plain");

		httpCon.setRequestMethod("PUT");
		OutputStreamWriter out = new OutputStreamWriter(
		    httpCon.getOutputStream());
		out.write(value);
		out.close();
		httpCon.getInputStream();
		}
		
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		
		writeToCache( "colts", "luck");
		
		System.out.println("done");
	}

}
