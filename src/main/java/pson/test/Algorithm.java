package pson.test;

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

    public static String getKey(int id) {
        String result = HttpClient.getJsonByID(id);
        String keyWord = Analysis.analysis(result);
        return keyWord;
    }
}
