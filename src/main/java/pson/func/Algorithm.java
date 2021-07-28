package pson.func;

import pson.http.Analysis;
import pson.http.HttpClient;
import com.bc.sm4.SM4Util;

public class Algorithm {
    public static String entry(String key, String original) {
        String cipher = SM4Util.encryptEcb(key, original);
        return cipher;
    }

    public static String decrypt(String key, String cipher) {
        String original = SM4Util.decryptEcb(key, cipher);
        return original;
    }

    public static String getKey(String name) {
        String result = HttpClient.getJsonByName(name);
        String keyWord = Analysis.analysisName(result);
        return keyWord;
    }

    public static int check(String keyName, String userName) {
        String result = HttpClient.getPerPermission(keyName, userName);
        if (result == null)
            return 0;
        else
            return 1;
    }
}
