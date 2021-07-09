package pson.http;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Analysis {
    public static String analysis(String result){
        JsonParser parser = new JsonParser();
        JsonObject jsonObject  = parser.parse(result).getAsJsonObject();
        JsonObject data = jsonObject.get("data").getAsJsonObject();
        JsonObject data1 = data.get("data").getAsJsonObject();
        String keyWord = data1.get("keyWord").getAsString();

        return keyWord;
    }
}
