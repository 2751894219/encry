import com.bc.sm4.SM4Key;
import com.bc.sm4.SM4Util;
import pson.http.HttpClient;
import pson.test.Algorithm;

public class test {
    public static void main(String[] args) {
        String result = HttpClient.getJsonByID(0);
        System.out.println(result);
    }
}
