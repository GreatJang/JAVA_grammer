package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class C1703JsonWithJacksonRaw {
    public static void main(String[] args) {
        //JackSon 라이브러리의 핵심 메소드 ⭐ObjectMapper
        ObjectMapper mapper = new ObjectMapper(); // 객체 생성
        try {
//            readTree를 통해서 json을 계층적 트리구조형태(Map형태)로 변환
            File myPath = Paths.get("src/C17ExceptionFileParsing/test-data1.json").toFile();
            JsonNode data1 =  mapper.readTree(myPath);
            Map<String, String> studentMap = new HashMap<>(); // json파일이 ket:value조합이므로 Map으로 받아주면 좋을 듯. // Map으로 parsing가능
            studentMap.put("name", data1.get("name").asText()); // 자동화 구성, key는 약속이 되어있어야함. // asText String으로 변환
            studentMap.put("id", data1.get("id").asText());
            studentMap.put("classNumber", data1.get("classNumber").asText());
            studentMap.put("city", data1.get("city").asText());
            System.out.println(studentMap);

//            key:value중에 value의 타입이 예상되지 않을때는 Object타입으로도 받을 수 있다. // Key는 String
//            Map<String, Object> studentMap2 = mapper.readValue(myPath, Map.class);
            Map<String, String> studentMap2 = mapper.readValue(myPath, Map.class); // Map.class Map의 클래스
            System.out.println(studentMap2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
