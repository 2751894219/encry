import pson.func.Algorithm;
import pson.http.HttpClient;

public class test {
    public static void main(String[] args) {
        String result = Algorithm.getKey("test_key_0");
        System.out.println(result);
    }
}
