package C17ExceptionFileParsing;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class C1705JsonWithJacksonHttp {
    public static void main(String[] args) {
//        http클라이언트 생성
        HttpClient client = HttpClient.newHttpClient();
//        http 요청객체 생성
        HttpRequest request = HttpRequest.newBuilder()


                .build();

    }
}
