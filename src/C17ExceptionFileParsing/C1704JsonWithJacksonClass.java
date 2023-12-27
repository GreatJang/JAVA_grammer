package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class C1704JsonWithJacksonClass {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper(); // 객체 생성
        File myPath = Paths.get("src/C17ExceptionFileParsing/test-data2.json").toFile();
        try {
            JsonNode jsonNode =  mapper.readTree(myPath);
            List<Students> StudentsList = new ArrayList<>();

            for(JsonNode j : jsonNode.get("students")){
                Students myStudents = mapper.readValue(j.toString(), Students.class); // toString으로 String으로 변경
                StudentsList.add(myStudents);
            }
            System.out.println(StudentsList);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class Students{
    int id;
    String name;
    String classNumber;
    String city;

    @Override
    public String toString() {
        return "id: " + this.id + " name: " + this.name + " classNumber: " + this.classNumber + " city: " + this.city;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getClassNumber() {
        return classNumber;
    }
    public String getCity() {
        return city;
    }
}