package C17ExceptionFileParsing;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import static java.nio.file.Files.readAllLines;

//text파일 parsing
public class C1702FileParsing {
    public static void main(String[] args) {

        Path filePath = Paths.get("src/C17ExceptionFileParsing/text_file.txt");

//        버퍼기능이 구현돼있고, nio패키지에서는 non-blockinng방식 사용
//        기본이 StandardCharsets.UTF_8
//        파일시스템 이기때문에 예외처리해주어야 함 checked
//        CREATE_NEW 이후에 APPEND 실행가능.
//        파일쓰기
//        try {
//            if(Files.exists(filePath)){
////                append : 추가, write : 덮어쓰기
//                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.APPEND);
//            }else{
//                Files.write(filePath, "".getBytes(), StandardOpenOption.CREATE_NEW);
//
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace(); // 에러정보 출력
//        }

//        파일읽기 : readString, readAllLines(List형태)
        try {
//            String mySt =  Files.readString(filePath);
//            System.out.println(mySt);
//            readAllLines을 가지고 for문을 돌려 출력.
//            개행을 기준으로 잘라서 출력해줌.
            List<String> myList = Files.readAllLines(filePath);
            for(String a : myList){
                System.out.println(a);
            }
        } catch (IOException e) {
            e.printStackTrace(); // 에러정보 출력
        }



    }
}
