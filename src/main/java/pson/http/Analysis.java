package pson.http;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Analysis {
    public static String analysisName(String result) {
        JsonParser parser = new JsonParser();
        JsonObject jsonObject  = parser.parse(result).getAsJsonObject();
        String keyWord = jsonObject.get("data").getAsString();
        return keyWord;
    }

    public static int analysisPermission(String result) {
        JsonParser parser = new JsonParser();
        JsonObject jsonObject  = parser.parse(result).getAsJsonObject();
        String keyWord = jsonObject.get("result").getAsString();
        if (keyWord.equals(" 用户有权限 "))
            return 1;
        else
            return 0;
    }
}
