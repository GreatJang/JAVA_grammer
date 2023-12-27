
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.util.*;

class test2{
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();
//        http 요청객체 생성
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();
//        http응답객체 생성
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String post = response.body();
            JsonNode jsonNode = mapper.readTree(post);
            System.out.println(jsonNode);

//            post1은 생성자 순서와 같아야함
            Post post1 = new Post(jsonNode.get("userId").asInt(), jsonNode.get("id").asInt(), jsonNode.get("title").asText(), jsonNode.get("body").asText());
            System.out.println(post1);

//            readValue를 사용해서 객체로 곧바로 매핑 // 기본생성자만 있어야지 정상적으로 매핑가능
//            Post post2 = mapper.readValue(post, Post.class);
//            System.out.println(post2);
//            JsonNode는 트리구조 이므로

//            List<Post> postList = new ArrayList<>();
//            for(JsonNode j : jsonNode){
//                Post myPost = mapper.readValue(j.toString(), Post.class);
//                postList.add(myPost);
//            }
//            System.out.println(postList);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
class Post{
    int userId;
    int id;
    String title;
    String body;

    Post(int userId, int id, String title, String body){
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }
    Post(){
    }

    @Override
    public String toString() {
        return "id: " + this.id + " title: " + this.title;
    }
    public int getUserId() {
        return userId;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getBody() {
        return body;
    }
}