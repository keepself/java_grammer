package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class C1704JsonWithJacksonClass {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Students> studentList= new ArrayList<>();
        File path = Paths.get("src/C17ExceptionFileParsing/test-data2.json").toFile();
        JsonNode node = mapper.readTree(path).get("students");
        for (JsonNode a :node){
            Students students = mapper.readValue(a.toString(),Students.class);
            studentList.add(students);

        }
        System.out.println(studentList);
    }
}

class Students {

    int id;

    String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    int classNumber;

    String city;

    Students() {


    }
    @Override
    public String toString() {
        return "\n"+
                "id:" + this.id + "\n"+
                "name:" + this.name + "\n"+
                "classNumber:" + this.classNumber + "\n"+
                "city:" + this.city + "\n";
    }
}