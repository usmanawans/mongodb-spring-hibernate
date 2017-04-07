package mongo.services;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.json.JSONObject;

/**
 * Created by Usman on 07.04.2017.
 */


public class JSONParser {

    static InputStream is = null;
    static JSONObject jObj = null;
    static String json = "";

    // constructor
    public JSONParser() {

    }

    public JSONObject getJSONFromUrl(String url) {



        // Making HTTP request
        try {
            //JSONObject json = new JSONObject(IOUtils.toString(new URL("https://graph.facebook.com/me"), Charset.forName("UTF-8")));

        } catch (Exception e) {
        }

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    is, "iso-8859-1"), 8);
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
                System.out.println(line);
            }
            is.close();
            json = sb.toString();

        } catch (Exception e) {
        }

        // try parse the string to a JSON object
        try {
            jObj = new JSONObject(json);
        } catch (Exception e) {
        }

        // return JSON String
        return jObj;

    }
}
