package com.ksimeo.arsu.admin.connect;

import com.ksimeo.arsu.core.models.User;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Properties;

/**
 * @author Ksimeo 09.11.2015.
 */
public class RestRequest implements IRestRequests {

    private static final String urlBase = "http://localhost:8080";
    private String fullURL = null;
    private ObjectMapper om = null;

    public User getUser(String login, String password) {
        try {
            IRestRequests restRequest = new RestRequest();
            Properties prop = new Properties();
            String fullURL = urlBase + "/getuserbylogin";
            prop.put("login", login);
            prop.put("password", password);
            om = new ObjectMapper();
            String sendData = om.writeValueAsString(prop);
            String getData = sendPost(fullURL, sendData);
            return om.readValue(getData, User.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<User> getUsers() {
        try {
            IRestRequests restRequests = new RestRequest();
            fullURL = urlBase + "/getusers";
            String getData = sendGet(fullURL);
            return om.readValue(getData, new TypeReference<List<User>>(){});
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String sendGet(String url) throws Exception {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // optional default is GET
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }

    // HTTP POST request
    private String sendPost(String url, String data) throws Exception {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(data);
        wr.flush();
        wr.close();
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }
}
