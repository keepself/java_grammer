package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class C1705JsonWithJackSonHttp {
    public static void main(String[] args) {

        //      http클라이언트 생성
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();
//      http 요청객체 생성
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();
//  http응답객체 생성
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String post = response.body();
            JsonNode jsonNode = mapper.readTree(post);
//            Post post1 = new Post(
//                    jsonNode.get("userId").asInt(),
//                    jsonNode.get("id").asInt(),
//                    jsonNode.get("title").asText(),
//                    jsonNode.get("body").asText()
//            );
//            readValue를 사용해서 객체로 곧바로 매핑

//            Post myPost2 = mapper.readValue(post, Post.class);
//            System.out.println(myPost2);
//            JsonNode는 트리구조 이므로,
//            for(JsonNode j : jsonNode) 이런 형식이 가능.


            List<Post> postList = new ArrayList<>();
            for(JsonNode j : jsonNode){
                Post myPost = mapper.readValue(j.toString(), Post.class);
                postList.add(myPost);
            }
            System.out.println(postList);

//            System.out.println("userId : " + post1.getUserId());
//            System.out.println("id : " + post1.getId());
//            System.out.println("title : " + post1.getTitle());
//            System.out.println("body : " + post1.getBody());

//            java객체를 json데이터로 직렬화
//            String serialized_data = mapper.writeValueAsString(postList);
//            System.out.println(serialized_data);


        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

class Post {

    int userId;
    int id;
    String title;
    String body;

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



    Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;

    }

    Post(){

    }
    @Override
    public String toString() {
        return "userId : " + this.userId + "\n"
                + "id : " + this.id + "\n"
                + "title : " + this.title + "\n"
                + "body : " + this.body + "\n";
    }

}