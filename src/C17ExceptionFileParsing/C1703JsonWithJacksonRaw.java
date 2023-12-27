package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.HashMap;

public class C1703JsonWithJacksonRaw {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
//            readTree를 통해서 json을 계층적 트리구조형태로 변환
            File myPath = Paths.get("src/C17ExceptionFileParsing/test-data1.json").toFile();
            JsonNode data1 = mapper.readTree(
                    Paths.get("src/C17ExceptionFileParsing/test-data1.json").toFile()
            );
            Map<String,String> StuedntMap = new HashMap<>();
            StuedntMap.put("id", data1.get("id").asText());
            StuedntMap.put("name", data1.get("name").asText());
            StuedntMap.put("classNumber", data1.get("classNumber").asText());
            StuedntMap.put("city", data1.get("city").asText());
            System.out.println(StuedntMap);

//            key : value중에 value의 타입이 예상되지 않을때는 Object타입으로도 받을수 있다.
            Map<String, String> studentMap2 = mapper.readValue(myPath, Map.class);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
