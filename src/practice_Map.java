import java.util.*;
public class practice_Map {
    public static void main(String[] args) {
//        <String, String> -> Map
//        삽입된 데이터에 순서가 없다.
        Map<String, String> myMap = new HashMap<>();
        myMap.put("basketball", "농구");
        myMap.put("soccer", "축구");
        myMap.put("baseball", "야구");
        System.out.println(myMap);
        System.out.println(myMap.get("basketball"));

//        size(), isEmpty()사용가능

//        이미 key가 있을경우 put을 하면 덮어쓰기
        myMap.put("basketball", "탁구");
//        없으면 put이 putIfAbsent
        myMap.putIfAbsent("baseball", "배구");
        System.out.println(myMap);

























    }
}
